package com.beaconstrategists.plugininterface;

public interface TranslationPlugin {
    String translateRequest(String requestPayload);
    String translateResponse(String responsePayload);
    boolean supports(String apiKey);
}

