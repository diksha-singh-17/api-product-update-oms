package com.sc.service;

import java.io.File;
import java.io.IOException;

import com.sc.model.VaultItem;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import sc.util.LoggerUtility;

@Service
public class RIIUPPFileUploadService {
	@Autowired
	private VaultService vaultService;

	private String apiUrl;

	@Autowired
	private LoggerUtility log;

	VaultItem vaultItem;

	@Autowired
	public RIIUPPFileUploadService(@Qualifier("vaultItem") VaultItem vaultItem) {
		this.vaultItem = vaultItem;
		this.apiUrl = vaultItem.getOmsFileUploadUrl();

	}

	public void uploadFile(String accessToken, File riiuppFile, String correlationId) {
		try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
			apiUrl = apiUrl + riiuppFile.getName();

			HttpPut httpPut = new HttpPut(apiUrl);

			// Set authorization header with OAuth2.0 access token
			httpPut.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);

			// Set content type header to octet-stream
			httpPut.setHeader(HttpHeaders.CONTENT_TYPE, "application/octet-stream");

			HttpEntity entity = new FileEntity(riiuppFile, ContentType.DEFAULT_BINARY);
			httpPut.setEntity(entity);

			CloseableHttpResponse response;

			response = httpclient.execute(httpPut);
			Integer responseCode = response.getStatusLine().getStatusCode();
			if (responseCode.equals(HttpStatus.SC_NO_CONTENT)) {
				log.info("File uploaded to OMS System", correlationId);
			}
			response.close();
		} catch (IOException e) {
			log.error("Exception occured while uploading the file to OMS",
					new Throwable("Exception occured while uploading the file to OMS"), correlationId);
		}

	}

}