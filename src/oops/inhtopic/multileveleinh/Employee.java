package oops.inhtopic.multileveleinh;

public class Employee extends Person
{
	int id,salary;
	String dsgn;
	public Employee() 
	{
		System.out.println("Student : Default Constructor");
	} 
	public Employee(int id,String name,int salary,String dsgn) 
	{
		super(name);
		System.out.println("Student : PARA Constructor");
		this.id = id;
		this.salary = salary;
		this.dsgn = dsgn;
	}
}
