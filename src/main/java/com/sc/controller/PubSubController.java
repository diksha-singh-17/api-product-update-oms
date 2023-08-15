package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.dto.PubsubMessage;
import com.sc.dto.RootItem;
import com.sc.service.RIIUPPService;

import jakarta.servlet.http.HttpServletRequest;
import sc.util.LoggerUtility;

@RestController
@RequestMapping("/subscriber/product")
public class PubSubController {

	@Autowired
	private LoggerUtility log;

	@Autowired
	private RIIUPPService riiuppService;

	@PostMapping("/update")
	public HttpStatus receiveMessage(HttpServletRequest request, @RequestBody PubsubMessage message) {
		String xCorrelationId = null;
		try {
			List<RootItem> items = message.getData();
			xCorrelationId = message.getAttributes().get("CorrelationID");
			riiuppService.processItems(items, xCorrelationId);
			return HttpStatus.OK;
		} catch (Exception e) {
			log.error("Exception Occured while Mapping JSON message  " + xCorrelationId,
					new Throwable("Exception Occured while Mapping JSON message"), xCorrelationId);
		}
		return HttpStatus.EXPECTATION_FAILED;
	}
}