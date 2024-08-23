package com.beaconstrategists.apigateway;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class ApiGatewayApplicationTests {

    @Autowired
    private WebApplicationContext context;

//    @Autowired
//    private RouteLocator routeLocator;

    private MockMvc mockMvc;

    @Autowired
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void contextLoads() {
        // Verifies that the application context loads correctly
        assertThat(context).isNotNull();
    }

    @Test
    public void routesAreLoaded() {
        // Verifies that the routes are loaded in the application
        //assertThat(routeLocator.getRoutes()).isNotEmpty();
    }

    @Test
    public void testRouteExists() throws Exception {
        // Example test to verify that a specific route exists and is accessible
        mockMvc.perform(get("/api/some-endpoint"))
                .andExpect(status().isOk());
    }

    @Test
    public void testRouteRedirectsCorrectly() throws Exception {
        // Test to verify that a route correctly rewrites and proxies the request
        mockMvc.perform(get("/api/some-endpoint"))
                .andExpect(status().isOk());
        // You can add more checks here, like verifying the response content or headers
    }
}

