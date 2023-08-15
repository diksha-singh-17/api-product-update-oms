package com.sc.service.impl;

import com.jayway.jsonpath.JsonPath;
import com.sc.service.ApigeeTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@Service
public class ApigeeTokenProviderImpl implements ApigeeTokenProvider {

	@Value("${oauth.secret.code.client.id}")
	String clientId;
	@Value("${oauth.secret.code.client.secret}")
	String accessCodeClientSecret;
	@Value("${oauth.secret.code.grant.type}")
	String grantType;
	@Value("${oauth.secret.code.redirect.uri}")
	String accessCodRredirectUri;
	@Value("${oauth.secret.token.url}")
	String apiggeTokenUrl;
	@Value("${oauth.authorization.url}")
	String apigeeAuthUrl;

	@Autowired
	RestTemplate restTemplate;

	@Value("${spring.profiles.active}")
	private String activeProfile;

	@Override
	public String getApiggeeToken() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("client_id", clientId);
		map.add("client_secret", accessCodeClientSecret);
		map.add("grant_type", grantType);
		map.add("code", getApigeeTokenStep1());
		map.add("redirect_uri", accessCodRredirectUri);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);

		ResponseEntity<String> response = restTemplate.postForEntity(apiggeTokenUrl, request, String.class);

		String jsonResp = response.getBody();

		return JsonPath.parse(jsonResp).read("$.access_token");

	}

	public String getApigeeTokenStep1() {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		final HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);

		String url = new StringBuilder().append(apigeeAuthUrl).append("?response_type=code&client_id=").append(clientId)
				.append("&redirect_uri=").append(accessCodRredirectUri).toString();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, entity, String.class);
		String jsonResp = responseEntity.getBody();

		return JsonPath.parse(jsonResp).read("$.code");
	}
}
