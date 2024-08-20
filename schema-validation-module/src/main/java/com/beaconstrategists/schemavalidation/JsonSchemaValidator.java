package com.beaconstrategists.schemavalidation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.core.report.ProcessingReport;

public class JsonSchemaValidator {

    public void validate(String jsonPayload, JsonNode schemaNode) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonPayload);
        
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);
        
        ProcessingReport report = schema.validate(jsonNode);
        if (!report.isSuccess()) {
            throw new JsonValidationException(report.toString());
        }
    }
}

