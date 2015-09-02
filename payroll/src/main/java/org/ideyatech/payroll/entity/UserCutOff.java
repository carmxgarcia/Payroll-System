package org.ideyatech.payroll.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class UserCutOff {

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cutOff_id")
	private CutOff cutOff;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Column
	private double basicSalary;
	
	@Column
	private int numberOfDependents;
	
	@Column
	private double otherTaxable;
	
	@Column
	private double nonTaxable;
	
	@Column
	private int absence;
	
	@Column
	private float overtime;
	
	@Column
	private float tardiness;
	
	@Column
	private double sss;
	
	@Column
	private double pagIbig;
	
	@Column
	private double philhealth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(int numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	public double getOtherTaxable() {
		return otherTaxable;
	}

	public void setOtherTaxable(double otherTaxable) {
		this.otherTaxable = otherTaxable;
	}

	public double getNonTaxable() {
		return nonTaxable;
	}

	public void setNonTaxable(double nonTaxable) {
		this.nonTaxable = nonTaxable;
	}

	public int getAbsence() {
		return absence;
	}

	public void setAbsence(int absence) {
		this.absence = absence;
	}

	public float getOvertime() {
		return overtime;
	}

	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}

	public float getTardiness() {
		return tardiness;
	}

	public void setTardiness(float tardiness) {
		this.tardiness = tardiness;
	}

	public double getSss() {
		return sss;
	}

	public void setSss(double sss) {
		this.sss = sss;
	}

	public double getPagIbig() {
		return pagIbig;
	}

	public void setPagIbig(double pagIbig) {
		this.pagIbig = pagIbig;
	}

	public double getPhilhealth() {
		return philhealth;
	}

	public void setPhilhealth(double philhealth) {
		this.philhealth = philhealth;
	}
	
	
}
