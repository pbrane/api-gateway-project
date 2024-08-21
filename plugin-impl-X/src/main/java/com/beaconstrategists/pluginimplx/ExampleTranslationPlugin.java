package com.beaconstrategists.pluginimplx;

import com.beaconstrategists.plugininterface.TranslationPlugin;

public class ExampleTranslationPlugin implements TranslationPlugin {

    @Override
    public String translateRequest(String requestPayload) {
        // Custom translation logic
        return null;
        //return translatedRequest;
    }

    @Override
    public String translateResponse(String responsePayload) {
        // Custom translation logic
        return null;
        //return translatedResponse;
    }

    @Override
    public boolean supports(String apiKey) {
        return "example-api-key".equals(apiKey);
    }
}

