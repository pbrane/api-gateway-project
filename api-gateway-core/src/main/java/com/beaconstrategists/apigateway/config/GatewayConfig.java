package com.beaconstrategists.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("example_route", r -> r.path("/api/**")
                .filters(f -> f.rewritePath("/api/(?<segment>.*)", "/$\\{segment}")
                              .filter(new CustomPluginFilter())
                )
                .uri("http://adjacent-app.com"))
            .build();
    }
}

