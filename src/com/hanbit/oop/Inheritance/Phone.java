package com.hanbit.oop.Inheritance;

import javax.swing.JOptionPane;

public class Phone {
     protected String name,phoneNo,brand,call,data,size,appl;
    

	public String getSize() {
		return size;
	}

	public String getAppl() {
		return appl;
	}

	public void setAppl(String appl) {
		this.appl = appl;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public static String KIND="휴대폰";
     
     
     public String toString() {
		return String.format("%s 님에게 %s 번호로 %s %s전화기로 %s 라고 통화했다", 
				getName(),getPhoneNo(),getBrand(),KIND,getCall());
	}

	public String getName() {
		return name;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
     
}
