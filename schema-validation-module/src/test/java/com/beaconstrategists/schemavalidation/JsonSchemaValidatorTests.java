package com.beaconstrategists.schemavalidation;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSchemaValidatorTests {

    private JsonSchemaValidator jsonSchemaValidator;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        jsonSchemaValidator = new JsonSchemaValidator();
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testValidJson() throws IOException {
        String jsonPayload = "{\"name\":\"John Doe\",\"age\":30}";
        String jsonSchema = "{"
                + "\"type\":\"object\","
                + "\"properties\":{"
                + "\"name\":{\"type\":\"string\"},"
                + "\"age\":{\"type\":\"integer\"}"
                + "},"
                + "\"required\":[\"name\",\"age\"]"
                + "}";

        JsonNode schemaNode = objectMapper.readTree(jsonSchema);

        //Assertions.assertDoesNotThrow(() -> jsonSchemaValidator.validate(jsonPayload, schemaNode));
    }

    @Test
    public void testInvalidJson() throws IOException {
        String jsonPayload = "{\"name\":\"John Doe\",\"age\":\"thirty\"}";
        String jsonSchema = "{"
                + "\"type\":\"object\","
                + "\"properties\":{"
                + "\"name\":{\"type\":\"string\"},"
                + "\"age\":{\"type\":\"integer\"}"
                + "},"
                + "\"required\":[\"name\",\"age\"]"
                + "}";

        JsonNode schemaNode = objectMapper.readTree(jsonSchema);

        // FIXME
        //Executable executable = () -> jsonSchemaValidator.validate(jsonPayload, schemaNode);
        //Assertions.assertThrows(JsonValidationException.class, executable);
    }

    @Test
    public void testMissingRequiredField() throws IOException {
        //String jsonPayload = "{\"name\":\"John Doe\"}";
        String jsonSchema = "{"
                + "\"type\":\"object\","
                + "\"properties\":{"
                + "\"name\":{\"type\":\"string\"},"
                + "\"age\":{\"type\":\"integer\"}"
                + "},"
                + "\"required\":[\"name\",\"age\"]"
                + "}";

        JsonNode schemaNode = objectMapper.readTree(jsonSchema);

        // FIXME
        //Executable executable = () -> jsonSchemaValidator.validate(jsonPayload, schemaNode);
        //Assertions.assertThrows(JsonValidationException.class, executable);
    }
}

