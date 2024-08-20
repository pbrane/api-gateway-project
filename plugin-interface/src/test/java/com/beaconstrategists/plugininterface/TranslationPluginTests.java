package com.beaconstrategists.plugininterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public interface TranslationPluginTests {

    /**
     * Test the translation of a request payload.
     */
    @Test
    void testTranslateRequest();

    /**
     * Test the translation of a response payload.
     */
    @Test
    void testTranslateResponse();

    /**
     * Test whether the plugin supports a given API key.
     */
    @Test
    void testSupports();

    /**
     * A helper method to return an instance of the plugin under test.
     * Each concrete test class must provide this method.
     *
     * @return the TranslationPlugin instance to be tested.
     */
    TranslationPlugin getPlugin();

    /**
     * Default method to test whether the plugin translates a request correctly.
     * This can be overridden by specific implementations if needed.
     *
     * @param originalRequest the original request payload
     * @param expectedTranslatedRequest the expected translated request payload
     */
    default void assertTranslateRequest(String originalRequest, String expectedTranslatedRequest) {
        TranslationPlugin plugin = getPlugin();
        String translatedRequest = plugin.translateRequest(originalRequest);
        assertEquals(expectedTranslatedRequest, translatedRequest, "The translated request did not match the expected output.");
    }

    /**
     * Default method to test whether the plugin translates a response correctly.
     * This can be overridden by specific implementations if needed.
     *
     * @param originalResponse the original response payload
     * @param expectedTranslatedResponse the expected translated response payload
     */
    default void assertTranslateResponse(String originalResponse, String expectedTranslatedResponse) {
        TranslationPlugin plugin = getPlugin();
        String translatedResponse = plugin.translateResponse(originalResponse);
        assertEquals(expectedTranslatedResponse, translatedResponse, "The translated response did not match the expected output.");
    }

    /**
     * Default method to test whether the plugin supports a specific API key.
     * This can be overridden by specific implementations if needed.
     *
     * @param validApiKey the valid API key that the plugin should support
     * @param invalidApiKey the invalid API key that the plugin should not support
     */
    default void assertSupports(String validApiKey, String invalidApiKey) {
        TranslationPlugin plugin = getPlugin();
        assertTrue(plugin.supports(validApiKey), "The plugin should support the valid API key.");
        assertFalse(plugin.supports(invalidApiKey), "The plugin should not support the invalid API key.");
    }
}

