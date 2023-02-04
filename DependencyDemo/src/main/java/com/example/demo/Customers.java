package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	
	private int custId;
	private String custName;
	private String courseName;
	
	@Autowired
	private Technologies techdDetail;
	
	public int getCustId() {
		return custId;
	}
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Technologies getTechdDetail() {
		return techdDetail;
	}

	public void setTechdDetail(Technologies techdDetail) {
		this.techdDetail = techdDetail;
	}

	public void display() {
		System.out.println("Customers Object Returned Successfully");
		techdDetail.tech();
	}
}
