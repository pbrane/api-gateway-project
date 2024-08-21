package com.beaconstrategists.apigateway.filter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.web.server.ServerWebExchange;

import com.beaconstrategists.plugininterface.TranslationPlugin;
import com.beaconstrategists.schemavalidation.JsonSchemaValidator;
import com.fasterxml.jackson.databind.JsonNode;

import reactor.core.publisher.Mono;

//@Configuration
public class CustomPluginFilter extends AbstractGatewayFilterFactory<CustomPluginFilter.Config> implements GatewayFilter {

    @Autowired
    private List<TranslationPlugin> translationPlugins;

    @Autowired
    private JsonSchemaValidator jsonSchemaValidator;

    @Override
    public GatewayFilter apply(Config config) {
        return null;
        /*
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            String apiKey = request.getHeaders().getFirst("Api-Key");

            TranslationPlugin plugin = translationPlugins.stream()
                .filter(p -> p.supports(apiKey))
                .findFirst()
                .orElseThrow(() -> new PluginNotFoundException("No plugin found for API key: " + apiKey));

            // Translate and validate request
            String translatedRequest = plugin.translateRequest(request.getBody().toString());
            //jsonSchemaValidator.validate(translatedRequest, loadRequestSchema(plugin));

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
        */
    }

    private JsonNode loadRequestSchema(TranslationPlugin plugin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadRequestSchema'");
    }

    public static class Config {
        // Configuration options for the filter
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filter'");
    }
}

