package com.cg.MPTassessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class EmployeeInfo {
	
	enum SortMethod{
		BYNAME,BYSALARY
	}
	
	public List<Employee> sort(List<Employee> emps,final SortMethod method){
		List<Employee> newList = new ArrayList();
		
		if(method.equals(method.BYNAME)) {
			Comparator<Employee> nameComparator = (a,b)->a.getName().compareTo(b.getName());
			newList =emps.stream().sorted(nameComparator).collect(Collectors.toList());
		}
		else {
			if(method.equals(method.BYSALARY)) {
				Comparator<Employee> salaryComparator =(a,b)->(a.getSalary()-b.getSalary());
				newList=emps.stream().sorted(salaryComparator).collect(Collectors.toList());
			}
		}
		return newList;
			
	}
	
	public boolean isCharacterPresentInAllNames(Collection<Employee> entities,String character) {
		boolean result =entities.stream().map(n->n.getName()).anyMatch(s->s.startsWith(character));
		return result;
	}
	
	public static void main(String args[]) {
		List<Employee> emps=new ArrayList();
		emps.add(new Employee("Mickey",100000));
		emps.add(new Employee("Timy",50000));
		emps.add(new Employee("Annny",40000));
		
		EmployeeInfo e = new EmployeeInfo();
		System.out.println(e.sort(emps, SortMethod.BYNAME));
		System.out.println(e.sort(emps, SortMethod.BYSALARY));
		
		System.out.println(e.isCharacterPresentInAllNames(emps, "a"));
	}

}
