package com.sc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthTokenRequest {
    public OAuthTokenRequest() {
    }

    public OAuthTokenRequest(String clientId, String clientSecret, String grantType, String code,
                             String redirectUri) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.grantType = grantType;
        this.code = code;
        this.redirectUri = redirectUri;
    }

    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("grant_type")
    private String grantType;
    @JsonProperty(" code")
    private String code;
    @JsonProperty("redirect_uri")
    private String redirectUri;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }
}