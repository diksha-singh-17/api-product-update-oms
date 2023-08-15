package com.sc.config;

import com.sc.constants.SCConstants;
import com.sc.model.VaultItem;
import com.sc.service.VaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties
public class VaultConfig {

    private final VaultService vaultService;

    @Value("${vault.path}")
    private String vaultPath;

    @Autowired
    public VaultConfig(VaultService vaultService) {
        this.vaultService = vaultService;
    }

    @Bean(name = "vaultItem")
    public VaultItem vaultItem() {
        VaultItem item = new VaultItem();
        item.setGcpProjectId(vaultService.retrieveSecretPropertyFromVault(SCConstants.GCP_PROJECT_ID));
        item.setGcpSubscriptionName(vaultService.retrieveSecretPropertyFromVault(SCConstants.GCP_SUBSCRIPTION_NAME));
        item.setGcpTopicName(vaultService.retrieveSecretPropertyFromVault(SCConstants.GCP_TOPIC_NAME));
        item.setPubsubSubscriptionId(vaultService.retrieveSecretPropertyFromVault(SCConstants.PUBSUB_SUBSCRIPTION_ID));
        item.setPubsubTopicId(vaultService.retrieveSecretPropertyFromVault(SCConstants.PUBSUB_TOPIC_ID));
        item.setOmsAccessTokenUrl(vaultService.retrieveSecretPropertyFromVault(SCConstants.OMS_ACCESS_TOKEN_URL));
        item.setOmsFileUploadUrl(vaultService.retrieveSecretPropertyFromVault(SCConstants.OMS_FILE_UPLOAD_URL));
        return item;
    }
}
