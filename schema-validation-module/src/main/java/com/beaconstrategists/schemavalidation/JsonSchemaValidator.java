package com.beaconstrategists.schemavalidation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

public class JsonSchemaValidator {

    public void validate(String jsonPayload, JsonNode schemaNode) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.readTree(jsonPayload);
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
    }
}

