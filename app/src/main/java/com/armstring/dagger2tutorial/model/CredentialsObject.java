package com.armstring.dagger2tutorial.model;

public class CredentialsObject {

    private String apiKey;
    private String sessionId;
    private String token;

    public CredentialsObject() {
    }

    public CredentialsObject(String apiKey, String sessionId, String token) {
        this.apiKey = apiKey;
        this.sessionId = sessionId;
        this.token = token;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getToken() {
        return token;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
