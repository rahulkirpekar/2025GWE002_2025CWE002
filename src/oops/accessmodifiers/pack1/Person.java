package oops.accessmodifiers.pack1;

public class Person 
{
	private String name;// private
	int age;// default
	protected int height;//protected
	public String qualification;// 
	
	
	public static void main(String[] args) 
	{
		Person per = new Person();
		per.name = "ABC";
		
		System.out.println("per.name : " + per.name);
		
	}
}
