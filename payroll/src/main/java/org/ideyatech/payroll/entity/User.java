package org.ideyatech.payroll.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	private int id;

	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;

	@Column(name="middlename")
	private String middleName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="dateofbirth")
	private Date dateOfBirth;
	
	@Column(name="maritalstatus")
	private String maritalStatus;
	
	@Column(name="numberofdependents")
	private int numberOfDependents;
	
	@Column(name="basicsalary")
	private double basicSalary;
	
	@Column(name="othertaxable")
	private double otherTaxable;
	
	@Column(name="nontaxable")
	private double nonTaxable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(int numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
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
	
}
