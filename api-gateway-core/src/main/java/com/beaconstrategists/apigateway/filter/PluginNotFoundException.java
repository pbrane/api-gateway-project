package com.beaconstrategists.apigateway.filter;

/**
 * Custom exception thrown when a suitable plugin cannot be found.
 */
public class PluginNotFoundException extends RuntimeException {

    /**
     * Constructs a new PluginNotFoundException with the specified detail message.
     *
     * @param message the detail message.
     */
    public PluginNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new PluginNotFoundException with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause the cause of the exception.
     */
    public PluginNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

