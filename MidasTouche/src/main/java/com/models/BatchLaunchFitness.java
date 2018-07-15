package com.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class BatchLaunchFitness 
{

	@Id
    int TransactionId;
	//String CourseCd;
	String CentreNm;
	int batchStrength;
	String coursenm;
	String centrnm;
	String RegionCd;
	/*@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CourseCd")
    private Course course;// fields are in object form
	
	@ManyToOne
	@JoinColumn(name="sid")
	private RegionCode regioncode; // fields are in object form
	*/
	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}

	public String getCentreNm() {
		return CentreNm;
	}
	public void setCentreNm(String centreNm) {
		CentreNm = centreNm;
	}
	public int getBatchStrength() {
		return batchStrength;
	}
	public void setBatchStrength(int batchStrength) {
		this.batchStrength = batchStrength;
	}
	
}
