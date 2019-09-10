package com.datageeks.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="EMPLOYEETPS")
@Inheritance(strategy = InheritanceType.JOINED)

public class Employee implements Serializable{
	@Id
	@Column(name = "EMPID")
	private Integer emplId=null;
	@Column(name = "EMPNAME")
	private String emplName=null;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer emplId, String emplName) {
		super();
		this.emplId = emplId;
		this.emplName = emplName;
	}
	public Integer getEmplId() {
		return emplId;
	}
	public void setEmplId(Integer emplId) {
		this.emplId = emplId;
	}
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", emplName=" + emplName + "]";
	}
	

}
