package com.datageeks.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACTEMPLOYEETPS")
@PrimaryKeyJoinColumn(name = "EMP_FK_ID")


public class ContractEmployee extends Employee {
	@Column(name = "CONTRACTPERIOD")
	private String contractperiod=null;
	@Column(name = "PAYPERHOUR")
	private Float payperhour=null;
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractEmployee(Integer emplId,String emplName,String contractperiod, Float payperhour) {
		setEmplId(emplId);
		setEmplName(emplName);
		this.contractperiod = contractperiod;
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
	public Float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(Float payperhour) {
		this.payperhour = payperhour;
	}
	@Override
	public String toString() {
		return "ContractEmployee [contractperiod=" + contractperiod + ", payperhour=" + payperhour + ", getEmplId()="
				+ getEmplId() + ", getEmplName()=" + getEmplName() + ", toString()=" + super.toString() + "]";
	}
	
	

}
