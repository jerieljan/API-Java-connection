package com.smart.auth;

/**
 * The basic structure of a credential object used for authenticating a client to SmartNet's API.
 */
public interface SmartNetCredentials {

    public String getConsumerKey();

    public String getConsumerSecret();

    public String getCurrentAuthToken();

    public String getReferrerURL();

    public String setNewAuthToken(TokenProvider provider);
}
