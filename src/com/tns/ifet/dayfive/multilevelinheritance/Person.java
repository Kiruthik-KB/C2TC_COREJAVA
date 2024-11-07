package com.tns.ifet.dayfive.multilevelinheritance;
import java.util.Date;
public class Person {
	
	private String name; 
	private long contactNo; 
	private Date dateOfBirth; 
	public Person(String name, long contactNo, Date dateOfBirth) { 
	super(); 
	this.name = name; 
	this.contactNo = contactNo; 
	this.dateOfBirth = dateOfBirth; 
	} 
	public String getName() { 
	return name; 
	} 
	public void setName(String name) { 
	this.name = name; 
	} 
	public long getContactNo() { 
	return contactNo; 
	} 
	public void setConatctNo(long contactNo) { 
	this.contactNo = contactNo; 
	} 
	public void getDateOfBirth() { 
	return dateOfBirth; 
	} 
	public void setDateOfBirth(Date dateOfBirth) { 
	this.dateOfBirth = dateOfBirth; 
	} 
	public Person() { 
	} 
	@Override 
	public String toString() { 
	return "Person [name=" + name + ", conatctNo=" + contactNo + ", dateOfBirth=" + dateOfBirth + "]"; 
	} 
	} 
	