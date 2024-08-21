package com.beaconstrategists.schemavalidation;

import org.reactivestreams.Publisher;
import org.springframework.core.io.buffer.DataBuffer;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonSchemaValidator {

    public void validate(Publisher<? extends DataBuffer> translatedResponse, JsonNode schemaNode) {
        /*
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.readTree(translatedResponse);
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = null;
        try {
            schema = factory.getJsonSchema(schemaNode);
        } catch (ProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        ProcessingReport report = null;
        try {
            report = schema.validate(jsonNode);
        } catch (ProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (!report.isSuccess()) {
            throw new JsonValidationException(report.toString());
        }
        */
        throw new UnsupportedOperationException("Unimplemented method 'validate'");
    }

    /*
    public void validate(Publisher<? extends DataBuffer> translatedResponse, JsonNode requestSchema) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validate'");
    }
    */
}

