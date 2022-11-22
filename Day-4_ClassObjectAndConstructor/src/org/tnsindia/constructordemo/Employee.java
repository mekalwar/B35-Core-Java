package org.tnsindia.constructordemo;

public class Employee {

	public int salary;
	public String name;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	Employee()
	{
		System.out.println("Default Constructor");
	}
	//
	public Employee(int salary, String name) {
		/*super();
		this.salary = salary;
		this.name = name;
	*/
		salary=25000;
		name="Nikita";
	}	
}
public void print()
{
	System.out.printlnn("The salary of "+name")
}
	
	
	
	
