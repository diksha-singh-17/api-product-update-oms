package com.sc.dto;

import java.util.List;

public class VatItem {

	private int vatRegion;
    private String activeDateDisplay;
    private long activeDate;
    private String vatType;
    private String vatCode;
    private int vatRate;
    private List<Object> links;
    private HyperMediaContent hyperMediaContent;
	public int getVatRegion() {
		return vatRegion;
	}
	public void setVatRegion(int vatRegion) {
		this.vatRegion = vatRegion;
	}
	public String getActiveDateDisplay() {
		return activeDateDisplay;
	}
	public void setActiveDateDisplay(String activeDateDisplay) {
		this.activeDateDisplay = activeDateDisplay;
	}
	public long getActiveDate() {
		return activeDate;
	}
	public void setActiveDate(long activeDate) {
		this.activeDate = activeDate;
	}
	public String getVatType() {
		return vatType;
	}
	public void setVatType(String vatType) {
		this.vatType = vatType;
	}
	public String getVatCode() {
		return vatCode;
	}
	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}
	public int getVatRate() {
		return vatRate;
	}
	public void setVatRate(int vatRate) {
		this.vatRate = vatRate;
	}
	public List<Object> getLinks() {
		return links;
	}
	public void setLinks(List<Object> links) {
		this.links = links;
	}
	public HyperMediaContent getHyperMediaContent() {
		return hyperMediaContent;
	}
	public void setHyperMediaContent(HyperMediaContent hyperMediaContent) {
		this.hyperMediaContent = hyperMediaContent;
	}	
}
