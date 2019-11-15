package com.cts.academy.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "employee")
@XmlRootElement
public class Employee {
	@Id
	@Column(name = "employee_id", nullable = false)
	private String employeeId;

	@Column(name = "policy_id", nullable = false)
	private String policyId;

	@Transient
	private String insurerName = "";

	@Transient
	private String insuranceStartDate = "";

	@Transient
	private String contactEmail = "";

	@Transient
	private int nosOfDependent ;

	@Column(name = "date_of_birth", nullable = false)
	private String dateOfBirth;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "sex", nullable = false)
	private String sex;

	@Column(name = "joining_date", nullable = false)
	private String joiningDate;
	

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
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

	public int getNosOfDependent() {
		return nosOfDependent;
	}

	public void setNosOfDependent(int nosOfDependent) {
		this.nosOfDependent = nosOfDependent;
	}

	public Employee withEnsurer(String insurerName) {
		this.setInsurerName(insurerName);
		return this;
	}

	public Employee withInsuranceStartDate(String policyEnforementDate) {
		this.setInsuranceStartDate(policyEnforementDate);
		return this;
	}

	public Employee withContactEmail(String contactEmail) {
		this.setContactEmail(contactEmail);
		return this;
	}

	public Employee withNosOfDependent(Integer nosOfDependent) {
		this.setNosOfDependent(nosOfDependent);
		return this;
	}
	
	public Employee withPolicyID(String policyID) {
		this.setPolicyId(policyID);
		return this;
	}


}
