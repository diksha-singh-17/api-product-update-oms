package com.sc.dto;

import java.util.List;

public class ItemSupplierCountry {

	private String originCountryId;
	private String primaryCountryInd;
	private int unitCost;
	private int leadTime;
	private Object pickupLeadTime;
	private int suppPackSize;
	private int innerPackSize;
	private List<Object> links;
	private HyperMediaContent hyperMediaContent;
	
	public String getOriginCountryId() {
		return originCountryId;
	}
	public void setOriginCountryId(String originCountryId) {
		this.originCountryId = originCountryId;
	}
	public String getPrimaryCountryInd() {
		return primaryCountryInd;
	}
	public void setPrimaryCountryInd(String primaryCountryInd) {
		this.primaryCountryInd = primaryCountryInd;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public int getLeadTime() {
		return leadTime;
	}
	public void setLeadTime(int leadTime) {
		this.leadTime = leadTime;
	}
	public Object getPickupLeadTime() {
		return pickupLeadTime;
	}
	public void setPickupLeadTime(Object pickupLeadTime) {
		this.pickupLeadTime = pickupLeadTime;
	}
	public int getSuppPackSize() {
		return suppPackSize;
	}
	public void setSuppPackSize(int suppPackSize) {
		this.suppPackSize = suppPackSize;
	}
	public int getInnerPackSize() {
		return innerPackSize;
	}
	public void setInnerPackSize(int innerPackSize) {
		this.innerPackSize = innerPackSize;
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
