package com.sc.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RIIUPP {

	private static final String PIPE = "|";

	private String company;

	private String recordCreatedDate;

	private String recordCreatedTime;

	private static final String recordType = "01";

	private static final String requestType = " ";

	private String sequence;

	private static final String keyType = "IT";

	// from topic
	private String item;

	private static final String SKU = " ";

	private static final String status = "U";

	private static final String processedDate = " ";

	private static final String processedTime = " ";

	private static final String allowSKUs = "N";

	private static final String dropShip = " ";

	// from topic
	private String longSKUStyle;

	// from topic
	private String retailStyle;

	// from topic
	private String longSKUVendor;

	private static final String nonInventory = " ";

	private static final String sellingQuantity = "1";

	private static final String sellingWeight = "0";

	private static final String serialTracking = "N";

	private static final String shipAlone = " ";

	private static final String allowDiscount = " ";

	private static final String overSize = " ";

	private String description;

	private static final String excludeFromFlexPay = " ";

	private static final String royality = "N";

	private static final String membership = " ";

	private static final String buyer = " ";

	private static final String itemClass = " ";

	private static final String locationClass = " ";

	private String longSKUClass;

	private String longSKUDept;

	private static final String uom = " ";

	private static final String vendor = " ";

	private static final String shipViaCode = " ";

	private static final String manufacturerVendor = " ";

	private static final String entityNumber = " ";

	private static final String season = " ";

	private static final String subscription = " ";

	private static final String heightOverride = "0";

	private static final String lengthOverride = "0";

	private static final String skuGiftCertificate = "N";

	private static final String restrictOrder = " ";

	private static final String vatExemptFlag = " ";

	private static final String supressBOCard = " ";

	private static final String returnable = " ";

	private static final String warehouse = " ";

	private static final String soldOutControlCode = " ";

	private static final String uomType = " ";

	private static final String orobEligible = " ";

	public RIIUPP(String sequence) {
		setCompany("300");
		setRecordCreatedDate();
		setRecordCreatedTime();
		setSequence(sequence);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRecordCreatedDate() {
		return recordCreatedDate;
	}

	public void setRecordCreatedDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
		String strDate = formatter.format(date);
		this.recordCreatedDate = "1" + strDate;
	}

	public String getRecordCreatedTime() {
		return recordCreatedTime;
	}

	public void setRecordCreatedTime() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
		String strDate = formatter.format(date);
		this.recordCreatedTime = strDate;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getLongSKUStyle() {
		return longSKUStyle;
	}

	public void setLongSKUStyle(String longSKUStyle) {
		this.longSKUStyle = longSKUStyle;
	}

	public String getRetailStyle() {
		return retailStyle;
	}

	public void setRetailStyle(String retailStyle) {
		this.retailStyle = retailStyle;
	}

	public String getLongSKUVendor() {
		return longSKUVendor;
	}

	public void setLongSKUVendor(String longSKUVendor) {
		this.longSKUVendor = longSKUVendor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongSKUClass() {
		return longSKUClass;
	}

	public void setLongSKUClass(String longSKUClass) {
		this.longSKUClass = longSKUClass;
	}

	public String getLongSKUDept() {
		return longSKUDept;
	}

	public void setLongSKUDept(String longSKUDept) {
		this.longSKUDept = longSKUDept;
	}

	public static String getRecordtype() {
		return recordType;
	}

	public static String getRequesttype() {
		return requestType;
	}

	public static String getKeytype() {
		return keyType;
	}

	public static String getSku() {
		return SKU;
	}

	public static String getStatus() {
		return status;
	}

	public static String getProcesseddate() {
		return processedDate;
	}

	public static String getProcessedtime() {
		return processedTime;
	}

	public static String getAllowskus() {
		return allowSKUs;
	}

	public static String getDropship() {
		return dropShip;
	}

	public static String getNoninventory() {
		return nonInventory;
	}

	public static String getSellingquantity() {
		return sellingQuantity;
	}

	public static String getSellingweight() {
		return sellingWeight;
	}

	public static String getSerialtracking() {
		return serialTracking;
	}

	public static String getShipalone() {
		return shipAlone;
	}

	public static String getAllowdiscount() {
		return allowDiscount;
	}

	public static String getOversize() {
		return overSize;
	}

	public static String getExcludefromflexpay() {
		return excludeFromFlexPay;
	}

	public static String getRoyality() {
		return royality;
	}

	public static String getMembership() {
		return membership;
	}

	public static String getBuyer() {
		return buyer;
	}

	public static String getItemclass() {
		return itemClass;
	}

	public static String getLocationclass() {
		return locationClass;
	}

	public static String getUom() {
		return uom;
	}

	public static String getVendor() {
		return vendor;
	}

	public static String getShipviacode() {
		return shipViaCode;
	}

	public static String getManufacturervendor() {
		return manufacturerVendor;
	}

	public static String getEntitynumber() {
		return entityNumber;
	}

	public static String getSeason() {
		return season;
	}

	public static String getSubscription() {
		return subscription;
	}

	public static String getHeightoverride() {
		return heightOverride;
	}

	public static String getLengthoverride() {
		return lengthOverride;
	}

	public static String getSkugiftcertificate() {
		return skuGiftCertificate;
	}

	public static String getRestrictorder() {
		return restrictOrder;
	}

	public static String getVatexemptflag() {
		return vatExemptFlag;
	}

	public static String getSupressbocard() {
		return supressBOCard;
	}

	public static String getReturnable() {
		return returnable;
	}

	public static String getWarehouse() {
		return warehouse;
	}

	public static String getSoldoutcontrolcode() {
		return soldOutControlCode;
	}

	public static String getUomtype() {
		return uomType;
	}

	public static String getOrobeligible() {
		return orobEligible;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getCompany()).append(PIPE).append(getRecordCreatedDate()).append(PIPE).append(getRecordCreatedTime())
				.append(PIPE).append(getRecordtype()).append(PIPE).append(getRequesttype()).append(PIPE)
				.append(getSequence()).append(PIPE).append(getKeytype()).append(PIPE).append(getItem()).append(PIPE)
				.append(getSku()).append(PIPE).append(getStatus()).append(PIPE).append(getProcesseddate()).append(PIPE)
				.append(getProcessedtime()).append(PIPE).append(getAllowskus()).append(PIPE).append(getDropship())
				.append(PIPE).append(getLongSKUStyle()).append(PIPE).append(getRetailStyle()).append(PIPE)
				.append(getLongSKUVendor()).append(PIPE).append(getNoninventory()).append(PIPE)
				.append(getSellingquantity()).append(PIPE).append(getSellingweight()).append(PIPE)
				.append(getSerialtracking()).append(PIPE).append(getShipalone()).append(PIPE).append(getAllowdiscount())
				.append(PIPE).append(getOversize()).append(PIPE).append(getDescription()).append(PIPE)
				.append(getExcludefromflexpay()).append(PIPE).append(getRoyality()).append(PIPE).append(getMembership())
				.append(PIPE).append(getBuyer()).append(PIPE).append(getItemclass()).append(PIPE)
				.append(getLocationclass()).append(PIPE).append(getLongSKUClass()).append(PIPE).append(getLongSKUDept())
				.append(PIPE).append(getUom()).append(PIPE).append(getVendor()).append(PIPE).append(getShipviacode())
				.append(PIPE).append(getManufacturervendor()).append(PIPE).append(getEntitynumber()).append(PIPE)
				.append(getSeason()).append(PIPE).append(getSubscription()).append(PIPE).append(getHeightoverride())
				.append(PIPE).append(getLengthoverride()).append(PIPE).append(getSkugiftcertificate()).append(PIPE)
				.append(getRestrictorder()).append(PIPE).append(getVatexemptflag()).append(PIPE)
				.append(getSupressbocard()).append(PIPE).append(getReturnable()).append(PIPE).append(getWarehouse())
				.append(PIPE).append(getSoldoutcontrolcode()).append(PIPE).append(getUomtype()).append(PIPE)
				.append(getOrobeligible());

		return sb.toString();
	}
}
