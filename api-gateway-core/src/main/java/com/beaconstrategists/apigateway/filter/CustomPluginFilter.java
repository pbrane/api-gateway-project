package com.beaconstrategists.apigateway.filter;

import com.beaconstrategists.plugininterface.TranslationPlugin;
import com.beaconstrategists.schemavalidation.JsonSchemaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.ServiceLoader;

@Configuration
public class CustomPluginFilter extends AbstractGatewayFilterFactory<CustomPluginFilter.Config> {

    @Autowired
    private List<TranslationPlugin> translationPlugins;

    @Autowired
    private JsonSchemaValidator jsonSchemaValidator;

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            String apiKey = request.getHeaders().getFirst("Api-Key");

            TranslationPlugin plugin = translationPlugins.stream()
                .filter(p -> p.supports(apiKey))
                .findFirst()
                .orElseThrow(() -> new PluginNotFoundException("No plugin found for API key: " + apiKey));

            // Translate and validate request
            String translatedRequest = plugin.translateRequest(request.getBody().toString());
            jsonSchemaValidator.validate(translatedRequest, loadRequestSchema(plugin));

            // Proceed with the translated request
            ServerHttpRequest modifiedRequest = exchange.getRequest().mutate().body(translatedRequest).build();
            return chain.filter(exchange.mutate().request(modifiedRequest).build())
                .then(Mono.fromRunnable(() -> {
                    // Handle and validate response
                    ServerHttpResponse response = exchange.getResponse();
                    String translatedResponse = plugin.translateResponse(response.getBody().toString());
                    jsonSchemaValidator.validate(translatedResponse, loadResponseSchema(plugin));
                    response.writeWith(translatedResponse);
                }));
        };
    }

    public static class Config {
        // Configuration options for the filter
    }
}

