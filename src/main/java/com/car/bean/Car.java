package com.car.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;  
@Entity  
//defining class name as Table name  
@Table  
public class Car  
{  
//Defining Car id as primary key  
@Id  
@Column  
private String carno;  
@Column  
private String dateofbooking;  
@Column  
private String fromlocation;  
@Column  
private String tolocation;
@Column  
private String bookedname;
@Column
private String bookedphonenumber;

public Car(String string, String string2, String string22, String string3, String string4, String string5) {
	// TODO Auto-generated constructor stub
}
public String getCarno() {
	return carno;
}
public void setCarno(String carno) {
	this.carno = carno;
}
public String getDateofbooking() {
	return dateofbooking;
}
public void setDateofbooking(String dateofbooking) {
	this.dateofbooking = dateofbooking;
}
public String getFromlocation() {
	return fromlocation;
}
public void setFromlocation(String fromlocation) {
	this.fromlocation = fromlocation;
}
public String getTolocation() {
	return tolocation;
}
public void setTolocation(String tolocation) {
	this.tolocation = tolocation;
}
public String getBookedname() {
	return bookedname;
}
public void setBookedname(String bookedname) {
	this.bookedname = bookedname;
}
public String getBookedphonenumber() {
	return bookedphonenumber;
}
public void setBookedphonenumber(String bookedphonenumber) {
	this.bookedphonenumber = bookedphonenumber;
}
public int getCarno1() {
	// TODO Auto-generated method stub
	return 0;
}
public static Car getCarByNo(int carno2) {
	// TODO Auto-generated method stub
	return null;
}
}
