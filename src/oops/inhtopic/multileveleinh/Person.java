package oops.inhtopic.multileveleinh;

public class Person 
{
	String name;
	
	public Person() 
	{
		System.out.println("Person : Default Constructor");
		name = "NULL";
	}
	public Person(String name)
	{
		System.out.println("Person : PARA Constructor");
		this.name=name;
	}
}
