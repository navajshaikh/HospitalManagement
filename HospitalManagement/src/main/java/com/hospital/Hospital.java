package com.hospital;


import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Hospital {
	
	
	private String name;
	private String address;
	private String type;
	
	
	@Autowired//(byType)
	private Doctor doctor;
	
	@Autowired
	private Patient patient;

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String name, String address, String type,Doctor doctor,Patient patient) {
		super();
		this.name = name;
		this.address = address;
		this.type = type;
		this.doctor = doctor;
		this.patient = patient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor d) {
		this.doctor = d;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	public void init() {
		fillForm();
		System.out.println("Patient admitted today....");
	}
	
	
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", address=" + address + ", type=" + type + ", doctor=" + doctor
				+ ", patient=" + patient + "]";
	}

	public void destroy() {
		
		payBill();
		
	}
	
	
	public void fillForm() {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String a=sc.next();
	
	System.out.println("Enter Your AddharCard Number");
	int b=sc.nextInt();
	
	System.out.println("\tHospital details are");
	}
	
	public void payBill() {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int y=r.nextInt(2000);
		System.out.println("Your amount is "+y+" please pay amount");
		int x=sc.nextInt();
		
		if(x==y) {
			System.out.println("You are Discharged");
			System.out.println("Patient discharged today....");
		}else {
			System.out.println("Please pay amount !!!!!");
		}
		
		sc.close();
		
	}
	
	
	
	
	
	
	

}
