package com.beaconstrategists.pluginimplx;

import com.beaconstrategists.plugininterface.TranslationPlugin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ExampleTranslationPluginTests {

    private TranslationPlugin translationPlugin;

    @BeforeEach
    public void setUp() {
        translationPlugin = new ExampleTranslationPlugin();
    }

    @Test
    public void testTranslateRequest() {
        String originalRequest = "{\"key\":\"value\"}";
        String expectedTranslatedRequest = "{\"key\":\"value_translated\"}";

        // Assuming the translateRequest method adds "_translated" to the value
        String translatedRequest = translationPlugin.translateRequest(originalRequest);

        Assertions.assertEquals(expectedTranslatedRequest, translatedRequest, 
                "The translated request did not match the expected output.");
    }

    @Test
    public void testTranslateResponse() {
        String originalResponse = "{\"result\":\"success\"}";
        String expectedTranslatedResponse = "{\"result\":\"success_translated\"}";

        // Assuming the translateResponse method adds "_translated" to the value
        String translatedResponse = translationPlugin.translateResponse(originalResponse);

        Assertions.assertEquals(expectedTranslatedResponse, translatedResponse, 
                "The translated response did not match the expected output.");
    }

    @Test
    public void testSupports() {
        String validApiKey = "example-api-key";
        String invalidApiKey = "invalid-api-key";

        Assertions.assertTrue(translationPlugin.supports(validApiKey), 
                "The plugin should support the valid API key.");
        Assertions.assertFalse(translationPlugin.supports(invalidApiKey), 
                "The plugin should not support the invalid API key.");
    }
}

