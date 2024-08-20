package com.beaconstrategists.authmodule;

import com.beaconstrategists.authmodule.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.unauthenticated;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringJUnitWebConfig(SecurityConfig.class)
@SpringBootTest
public class SecurityConfigTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Autowired
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(SecurityMockMvcConfigurers.springSecurity())
                .build();
    }

    @Test
    public void testLoginPageAccessible() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(status().isOk());
    }

    @Test
    public void testFormLoginSuccess() throws Exception {
        mockMvc.perform(formLogin().user("user").password("password"))
                .andExpect(authenticated());
    }

    @Test
    public void testFormLoginFailure() throws Exception {
        mockMvc.perform(formLogin().user("user").password("wrongpassword"))
                .andExpect(unauthenticated());
    }

    @Test
    @WithMockUser
    public void testAccessSecuredResourceWithAuthentication() throws Exception {
        mockMvc.perform(get("/secured-resource"))
                .andExpect(status().isOk());
    }

    @Test
    public void testAccessSecuredResourceWithoutAuthentication() throws Exception {
        mockMvc.perform(get("/secured-resource"))
                .andExpect(status().is3xxRedirection());
    }
}

