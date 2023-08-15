package com.sc.service.impl;

import com.sc.exception.VaultException;
import com.sc.service.ApigeeTokenProvider;
import com.sc.service.VaultService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class VaultServiceImpl implements VaultService {

    @Value("${vault.api.url}")
    private String apiUrl;
    Map<String, String> responseMap ;

    @Autowired
    ApigeeTokenProvider apigeeTokenProvider;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String retrieveSecretPropertyFromVault(String searchKey) {

        if (responseMap != null) {
            for (Map.Entry<String, String> entry : responseMap.entrySet()) {
                String key = entry.getKey();
                if(searchKey.equals(key)){
                    return entry.getValue();
                }
            }
        }
        throw  new VaultException("Error: Key does not exist in vault!!!");
    }

    @PostConstruct
    private void getStringStringMap() {
        String apiggeeToken = apigeeTokenProvider.getApiggeeToken();

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + apiggeeToken);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(null, headers);

        ResponseEntity<Map<String, String>> responseEntity = restTemplate.exchange(
                apiUrl,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<Map<String, String>>() {}
        );
        responseMap = responseEntity.getBody();
    }
}
