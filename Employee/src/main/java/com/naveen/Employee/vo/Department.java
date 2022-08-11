package com.naveen.Employee.vo;

public class Department {
	private long id;
	private String name;
	private int noOfEmp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public Department(long id,String name, int noOfEmp) {
		super();
		this.id = id;
		this.name = name;
		this.noOfEmp = noOfEmp;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
