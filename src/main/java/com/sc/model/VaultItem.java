package com.sc.model;

public class VaultItem {
    private String gcpProjectId;
    private String gcpSubscriptionName;
    private String gcpTopicName;
    private String pubsubTopicId;
    private String pubsubSubscriptionId;
    private String omsAccessTokenUrl;
    private String omsFileUploadUrl;

    public String getOmsFileUploadUrl() {
        return omsFileUploadUrl;
    }

    public void setOmsFileUploadUrl(String omsFileUploadUrl) {
        this.omsFileUploadUrl = omsFileUploadUrl;
    }

    public String getOmsAccessTokenUrl() {
        return omsAccessTokenUrl;
    }

    public void setOmsAccessTokenUrl(String omsAccessTokenUrl) {
        this.omsAccessTokenUrl = omsAccessTokenUrl;
    }

    public String getGcpProjectId() {
        return gcpProjectId;
    }

    public void setGcpProjectId(String gcpProjectId) {
        this.gcpProjectId = gcpProjectId;
    }

    public String getGcpSubscriptionName() {
        return gcpSubscriptionName;
    }

    public void setGcpSubscriptionName(String gcpSubscriptionName) {
        this.gcpSubscriptionName = gcpSubscriptionName;
    }

    public String getGcpTopicName() {
        return gcpTopicName;
    }

    public void setGcpTopicName(String gcpTopicName) {
        this.gcpTopicName = gcpTopicName;
    }

    public String getPubsubTopicId() {
        return pubsubTopicId;
    }

    public void setPubsubTopicId(String pubsubTopicId) {
        this.pubsubTopicId = pubsubTopicId;
    }

    public String getPubsubSubscriptionId() {
        return pubsubSubscriptionId;
    }

    public void setPubsubSubscriptionId(String pubsubSubscriptionId) {
        this.pubsubSubscriptionId = pubsubSubscriptionId;
    }
}
