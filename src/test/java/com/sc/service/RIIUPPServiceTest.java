package com.sc.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sc.dto.RootItem;

class RIIUPPServiceTest {

	@Mock
	ObjectMapper objectMapper;
	
	@BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        objectMapper = new ObjectMapper();
    }

	@Test
	void testReadFile() throws IOException {
		String fileName = "SampleTopicContent.txt";
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		StringBuilder stringBuilder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(System.lineSeparator());
		}
		reader.close();
		List<RootItem> items = Arrays.asList(objectMapper.readValue(stringBuilder.toString(), RootItem[].class));
		assertEquals(1, items.size());

	}
}
