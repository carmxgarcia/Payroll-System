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
	@JoinColumn(name="CUT_OFF_ID")
	private CutOff cutOff;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name="ABSENCE")
	private int absence;
	
	@Column(name="OVERTIME")
	private float overtime;
	
	@Column(name="TARDINESS")
	private float tardiness;
	
	@Column(name="SSS")
	private double sss;
	
	@Column(name="PAG_IBIG")
	private double pagIbig;
	
	@Column(name="PHILHEALTH")
	private double philhealth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
