package org.ideyatech.payroll.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class User {

	private String firstName;
	private String lastName;
	private String middleName;
	private int age;
	private String sex;
	private Date dateOfBirth;
	private String maritalStatus;
	private int numberOfDependents;
	private double basicSalary;
	private double otherTaxable;
	private double nonTaxable;
	
}
