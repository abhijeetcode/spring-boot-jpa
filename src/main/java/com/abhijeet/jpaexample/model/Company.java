package com.abhijeet.jpaexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Company {

	@Id
	@Column(name="holding_company_id")
	private int holdingCompanyId;
	
	@Column(name="holding_company_name")
	private String holdingCompanyName;
	
	@Column(name="phys_id")
	private int physicalId;
	
	@Column(name="comp_no")
	private String companyNo;
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="companies_id")
	private int companiesId;
	
	@Column(name="deleted")
	private String deleted;
	
	@Column(name="iln")
	private String iln;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int holdingCompanyId, String holdingCompanyName, int physicalId, String companyNo,
			String countryName, int companiesId, String deleted, String iln) {
		super();
		this.holdingCompanyId = holdingCompanyId;
		this.holdingCompanyName = holdingCompanyName;
		this.physicalId = physicalId;
		this.companyNo = companyNo;
		this.countryName = countryName;
		this.companiesId = companiesId;
		this.deleted = deleted;
		this.iln = iln;
	}

	public int getHoldingCompanyId() {
		return holdingCompanyId;
	}

	public void setHoldingCompanyId(int holdingCompanyId) {
		this.holdingCompanyId = holdingCompanyId;
	}

	public String getHoldingCompanyName() {
		return holdingCompanyName;
	}

	public void setHoldingCompanyName(String holdingCompanyName) {
		this.holdingCompanyName = holdingCompanyName;
	}

	public int getPhysicalId() {
		return physicalId;
	}

	public void setPhysicalId(int physicalId) {
		this.physicalId = physicalId;
	}

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getCompaniesId() {
		return companiesId;
	}

	public void setCompaniesId(int companiesId) {
		this.companiesId = companiesId;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getIln() {
		return iln;
	}

	public void setIln(String iln) {
		this.iln = iln;
	}

}
