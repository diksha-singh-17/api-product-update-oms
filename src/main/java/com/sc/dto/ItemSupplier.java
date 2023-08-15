package com.sc.dto;

import java.util.List;

public class ItemSupplier {

	private int supplier;
	private String primarySuppInd;
	private String vpn;
	private String directShipInd;
	private List<ItemSupplierCountry> itemSupplierCountry;
	private List<Object> links;
	private HyperMediaContent hyperMediaContent;
	public int getSupplier() {
		return supplier;
	}
	public void setSupplier(int supplier) {
		this.supplier = supplier;
	}
	public String getPrimarySuppInd() {
		return primarySuppInd;
	}
	public void setPrimarySuppInd(String primarySuppInd) {
		this.primarySuppInd = primarySuppInd;
	}
	public String getVpn() {
		return vpn;
	}
	public void setVpn(String vpn) {
		this.vpn = vpn;
	}
	public String getDirectShipInd() {
		return directShipInd;
	}
	public void setDirectShipInd(String directShipInd) {
		this.directShipInd = directShipInd;
	}
	public List<ItemSupplierCountry> getItemSupplierCountry() {
		return itemSupplierCountry;
	}
	public void setItemSupplierCountry(List<ItemSupplierCountry> itemSupplierCountry) {
		this.itemSupplierCountry = itemSupplierCountry;
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
