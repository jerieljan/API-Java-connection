package com.smart.auth;

/**
 * The basic structure for an object that connects to the API and supplies fresh keys for API use.
 */
public interface TokenProvider {

    public String getNewToken();

    public String getAuthEndpoint();
}
