package tiendm.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private String position;
	List<Employee> lsSubordinates;
	
	public Employee(String name, String dept, String position) {
		this.name = name;
		this.dept = dept;
		this.position = position;
		lsSubordinates = new ArrayList<>(); 
	}
	
	public void add(Employee e){
		lsSubordinates.add(e);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", position=" + position + "]";
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public List<Employee> getLsSubordinates() {
		return lsSubordinates;
	}
	public void setLsSubordinates(List<Employee> lsSubordinates) {
		this.lsSubordinates = lsSubordinates;
	}
	
}
