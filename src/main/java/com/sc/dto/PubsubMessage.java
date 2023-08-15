package com.sc.dto;

import java.util.List;
import java.util.Map;

public class PubsubMessage {

	private List<RootItem> data;
	private Map<String, String> attributes;

	public List<RootItem> getData() {
		return data;
	}

	public void setData(List<RootItem> data) {
		this.data = data;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
}
