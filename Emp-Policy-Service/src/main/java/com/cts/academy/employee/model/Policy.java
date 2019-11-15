package com.cts.academy.employee.model;

public class Policy {
   
	private String policyNumber;
	private String insurerName;
	private String insuranceStartDate;
	private String contactEmail;
	private int nosOfDependent;
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getInsurerName() {
		return insurerName;
	}
	public void setInsurerName(String insurerName) {
		this.insurerName = insurerName;
	}
	public String getInsuranceStartDate() {
		return insuranceStartDate;
	}
	public void setInsuranceStartDate(String insuranceStartDate) {
		this.insuranceStartDate = insuranceStartDate;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public int getNosOfDependent() {
		return nosOfDependent;
	}
	public void setNosOfDependent(int nosOfDependent) {
		this.nosOfDependent = nosOfDependent;
	}
	
	

}