package com.sc.service;

import com.sc.dto.RIIUPP;
import com.sc.dto.RootItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sc.util.LoggerUtility;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.List;

@Service
public class RIIUPPService {

	@Autowired
	ApigeeTokenProvider apigeeTokenProvider;

	@Autowired
	RIIUPPFileUploadService fileUploadService;

	@Autowired
	LoggerUtility log;

	public void processItems(List<RootItem> items, String xCorrelationId) {
		log.debug("Processing items", xCorrelationId);
		File file = new File("RIIUPP_" + Instant.now().toEpochMilli() + ".txt");
		String fileContent = "";
		StringBuilder content = new StringBuilder();
		Integer sequence = 1;
		for (RootItem item : items) {
			RIIUPP riiuppEntry = new RIIUPP(sequence.toString());
			riiuppEntry.setItem(item.getItem());
			riiuppEntry.setLongSKUStyle(item.getItemParent());
			riiuppEntry.setRetailStyle(item.getItem());
			riiuppEntry.setLongSKUVendor("" + item.getSubclass());
			riiuppEntry.setDescription(item.getItemDesc());
			riiuppEntry.setLongSKUClass("" + item.getClassAttribute());
			riiuppEntry.setLongSKUDept("" + item.getDept());
			content.append(riiuppEntry.toString()).append("/n");
			sequence++;
		}

		fileContent = content.toString();
		try {
			// Create the text file
			if (!file.exists()) {
				boolean newFileCreated = file.createNewFile();
				log.debug("Is new file created " + newFileCreated, xCorrelationId);
			}
		} catch (IOException e) {
			log.error("Exception occured while generating riiupp file",
					new Throwable("\"Exception occured while generating riiupp file\""), xCorrelationId);
		}

		try (FileWriter writer = new FileWriter(file)) {
			// Write the file content
			writer.write(fileContent);
		} catch (IOException e1) {
			log.error("Exception occured while writing to riiupp file",
					new Throwable("Exception occured while writing to riiupp file"), xCorrelationId);
		}

		fileUploadService.uploadFile(apigeeTokenProvider.getApiggeeToken(), file, xCorrelationId);
	}
}
