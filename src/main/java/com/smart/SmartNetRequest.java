package com.smart;

import java.util.Map;

/**
 * The basic structure of an API Request to the SmartNet API.
 */
public interface SmartNetRequest {

    public Map<String, String> getParameters();

    public String getHttpType();

    public String getApiUrl();

    public Map<String, String> getAdditionalHeaders();

}
