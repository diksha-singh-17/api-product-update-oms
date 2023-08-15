package com.sc.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import sc.util.LoggerUtility;

@Configuration
public class CommanConfig {

	@Bean
	public LoggerUtility loggerUtility() {
		return new LoggerUtility();
	}

	@Bean("restTempalte")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}
}
