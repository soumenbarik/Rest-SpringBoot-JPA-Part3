package com.cts.academy.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "policy")
@XmlRootElement
public class Policy {
   
	@Id
	@Column(name = "policy_id", nullable = false)
	private String policyId;
	
	@Column(name = "insurer_name", nullable = false)
	private String insurerName;
	
	@Column(name = "start_date", nullable = false)
	private String insuranceStartDate;
	
	@Column(name = "email", nullable = false)
	private String contactEmail;
	
	@Column(name = "nos_dependent", nullable = false)
	private String nosOfDependent;
	

	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
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
	public String getNosOfDependent() {
		return nosOfDependent;
	}
	public void setNosOfDependent(String nosOfDependent) {
		this.nosOfDependent = nosOfDependent;
	}
	
}