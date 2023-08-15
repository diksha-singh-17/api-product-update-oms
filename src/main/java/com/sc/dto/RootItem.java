package com.sc.dto;

import java.util.List;

public class RootItem {
	private Object itemGrandparent;
    private String itemParent;
    private String item;
    private String itemDesc;
    private String shortDesc;
    private String packInd;
    private String status;
    private int itemLevel;
    private int tranLevel;
    private int dept;
    private int classAttribute;
    private int subclass;
    private String diff1;
    private String diff2;
    private Object diff3;
    private Object diff4;
    private String primaryRefItemInd;
    private double originalRetail;
    private String sellableInd;
    private String orderableInd;
    private String inventoryInd;
    private List<Object> packitemBreakout;
    private List<ItemSupplier> itemSupplier;
    private List<VatItem> vatItem;
    private List<Object> links;
    private HyperMediaContent hyperMediaContent;
	public Object getItemGrandparent() {
		return itemGrandparent;
	}
	public void setItemGrandparent(Object itemGrandparent) {
		this.itemGrandparent = itemGrandparent;
	}
	public String getItemParent() {
		return itemParent;
	}
	public void setItemParent(String itemParent) {
		this.itemParent = itemParent;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getPackInd() {
		return packInd;
	}
	public void setPackInd(String packInd) {
		this.packInd = packInd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getItemLevel() {
		return itemLevel;
	}
	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	public int getTranLevel() {
		return tranLevel;
	}
	public void setTranLevel(int tranLevel) {
		this.tranLevel = tranLevel;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public int getClassAttribute() {
		return classAttribute;
	}
	public void setClassAttribute(int classAttribute) {
		this.classAttribute = classAttribute;
	}
	public int getSubclass() {
		return subclass;
	}
	public void setSubclass(int subclass) {
		this.subclass = subclass;
	}
	public String getDiff1() {
		return diff1;
	}
	public void setDiff1(String diff1) {
		this.diff1 = diff1;
	}
	public String getDiff2() {
		return diff2;
	}
	public void setDiff2(String diff2) {
		this.diff2 = diff2;
	}
	public Object getDiff3() {
		return diff3;
	}
	public void setDiff3(Object diff3) {
		this.diff3 = diff3;
	}
	public Object getDiff4() {
		return diff4;
	}
	public void setDiff4(Object diff4) {
		this.diff4 = diff4;
	}
	public String getPrimaryRefItemInd() {
		return primaryRefItemInd;
	}
	public void setPrimaryRefItemInd(String primaryRefItemInd) {
		this.primaryRefItemInd = primaryRefItemInd;
	}
	public double getOriginalRetail() {
		return originalRetail;
	}
	public void setOriginalRetail(double originalRetail) {
		this.originalRetail = originalRetail;
	}
	public String getSellableInd() {
		return sellableInd;
	}
	public void setSellableInd(String sellableInd) {
		this.sellableInd = sellableInd;
	}
	public String getOrderableInd() {
		return orderableInd;
	}
	public void setOrderableInd(String orderableInd) {
		this.orderableInd = orderableInd;
	}
	public String getInventoryInd() {
		return inventoryInd;
	}
	public void setInventoryInd(String inventoryInd) {
		this.inventoryInd = inventoryInd;
	}
	public List<Object> getPackitemBreakout() {
		return packitemBreakout;
	}
	public void setPackitemBreakout(List<Object> packitemBreakout) {
		this.packitemBreakout = packitemBreakout;
	}
	public List<ItemSupplier> getItemSupplier() {
		return itemSupplier;
	}
	public void setItemSupplier(List<ItemSupplier> itemSupplier) {
		this.itemSupplier = itemSupplier;
	}
	public List<VatItem> getVatItem() {
		return vatItem;
	}
	public void setVatItem(List<VatItem> vatItem) {
		this.vatItem = vatItem;
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
