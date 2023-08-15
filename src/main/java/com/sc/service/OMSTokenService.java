package com.sc.service;

import com.sc.model.VaultItem;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sc.dto.oauth.OAuthTokenResponse;

import jakarta.annotation.PostConstruct;
import sc.util.LoggerUtility;

@Service
public class OMSTokenService {

	@Autowired
	private VaultService vaultService;

	private String apiUrl;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	LoggerUtility log;


	VaultItem vaultItem;

	@Autowired
	public OMSTokenService(@Qualifier("vaultItem") VaultItem vaultItem) {
		this.vaultItem = vaultItem;
		this.apiUrl = vaultItem.getOmsAccessTokenUrl();

	}

	public String getOmsAccessToken(String apigeeToken, String xCorrelationId) {
		log.debug("Request recieved to generate OMS AccessToken", xCorrelationId);

		HttpClient httpClient = HttpClientBuilder.create().build();

		HttpPost request = new HttpPost(apiUrl);
		request.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + apigeeToken);

		String requestBody = "{\"key\":\"value\"}"; // Replace with your JSON payload

		StringEntity entity = null;
		String response = "";
		try {
			entity = new StringEntity(requestBody);
			HttpEntity responseEntity = httpClient.execute(request).getEntity();
			response = EntityUtils.toString(responseEntity);
			OAuthTokenResponse tokenResponse = objectMapper.readValue(response, OAuthTokenResponse.class);
			response = tokenResponse.getAccess_token();
		} catch (Exception e) {
			log.error("Exception occured while genearting OMS token " + e.getMessage(),
					new Throwable("Exception occured while genearting OMS token " + e.getMessage()), xCorrelationId);
		}
		request.setEntity(entity);
		log.debug("OMS AccessToken generated returning", xCorrelationId);
		return response;
	}
}
