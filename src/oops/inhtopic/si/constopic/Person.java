package oops.inhtopic.si.constopic;

public class Person 
{
	String name;
	
	public Person() 
	{
		System.out.println("Person : Default Constructor");
	}
	public Person(String name) 
	{
		System.out.println("Person : PARA Constructor");
		this.name=name;
	}
}
