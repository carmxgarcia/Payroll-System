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
	@JoinColumn(name="cutoffid")
	private CutOff cutOff;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	@Column(name="absence")
	private int absence;
	
	@Column(name="overtime")
	private float overtime;
	
	@Column(name="tardiness")
	private float tardiness;
	
	@Column(name="sss")
	private double sss;
	
	@Column(name="pagibig")
	private double pagIbig;
	
	@Column(name="philhealth")
	private double philhealth;
	
	@Column(name="basicsalary")
	private double basicsalary;
	
	@Column(name="othertaxable")
	private double othertaxable;
	
	@Column(name="nontaxable")
	private double nontaxable;
	
	@Column(name="numberofdependents")
	private double numberofdependents;
	
	@Column(name="totalsalary")
	private double totalsalary;

	public int getId() {
		return id;
	}

	public CutOff getCutOff() {
		return cutOff;
	}

	public void setCutOff(CutOff cutOff) {
		this.cutOff = cutOff;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public double getOthertaxable() {
		return othertaxable;
	}

	public void setOthertaxable(double othertaxable) {
		this.othertaxable = othertaxable;
	}

	public double getNontaxable() {
		return nontaxable;
	}

	public void setNontaxable(double nontaxable) {
		this.nontaxable = nontaxable;
	}

	public double getNumberofdependents() {
		return numberofdependents;
	}

	public void setNumberofdependents(double numberofdependents) {
		this.numberofdependents = numberofdependents;
	}

	public double getTotalsalary() {
		return totalsalary;
	}

	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
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
