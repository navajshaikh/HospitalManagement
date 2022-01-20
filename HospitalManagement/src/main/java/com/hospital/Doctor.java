package com.hospital;

import java.util.List;
import java.util.Map;

public class Doctor {

	private Map<Integer,String> name;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Map<Integer, String> name) {
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
		return "Doctor [name=" + name + "]";
	}
	
	
	
	
}
