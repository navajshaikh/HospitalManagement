package com.hospital;

import java.util.Map;


public class Patient {
	
	private Map<Integer, String> name;
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Map<Integer, String> name) {
		super();
		this.name = name;
	}

	public Map<Integer, String> getName() {
		return name;
	}

	public void setName(Map<Integer, String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}
	
	

}
