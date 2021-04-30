package com.cg.lessons2.bean;

public class StudentBean {
	
	private String name;
	private int rollNo;
	private String section;
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return rollNo;
	}
	public String getSection() {
		return section;
	}
	
	public StudentBean(String Name,int RollNo,String Section) {
		this.name=Name;
		this.rollNo= RollNo;
		this.section=Section;
	}
	
	public void setName(String Name) {
		this.name=Name;
	}
	public void setRoll(int RollNo) {
		this.rollNo=RollNo;
	}
	public void setSection(String Section) {
		this.section=Section;
	}
}
