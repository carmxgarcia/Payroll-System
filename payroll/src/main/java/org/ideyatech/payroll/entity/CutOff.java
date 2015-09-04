package org.ideyatech.payroll.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class CutOff {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="startdate")
	private Date start_date;
	
	@Temporal(TemporalType.DATE)
	@Column(name="enddate")
	private Date end_date;
	
	@Column(name="workingdays")
	private int workingdays;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}
	
}
