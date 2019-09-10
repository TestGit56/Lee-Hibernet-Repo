package com.datageeks.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "REGULAREMPLOYEETPS")
@PrimaryKeyJoinColumn(name = "EMP_FK_ID")

public class RegularEmployee extends Employee{
	@Column(name = "SALARY")
	private Float salory=null;
	@Column(name = "BONUS")
	private Float bonus=null;
	
	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(Integer emplId,String emplName,Float salory, Float bonus) {
		setEmplId(emplId);
		setEmplName(emplName);
		this.salory = salory;
		this.bonus = bonus;
	}

	public Float getSalory() {
		return salory;
	}

	public void setSalory(Float salory) {
		this.salory = salory;
	}

	public Float getBonus() {
		return bonus;
	}

	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salory=" + salory + ", bonus=" + bonus + ", getEmplId()=" + getEmplId()
				+ ", getEmplName()=" + getEmplName() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
