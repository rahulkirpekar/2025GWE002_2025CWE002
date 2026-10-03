package oops.abstopic.aclass.task2;

import java.util.Scanner;

public class TestApp1 
{
	//Runtime Polymorphism==> 
										// Upcasting (Parent reference = Child Object) 
										// Polymorphic Object   
										// Late Binding  
										// Dynamic Binding 
	public static void getBehaveByPlaced(Person person) 
	{
		person.getBehave();

		if (person instanceof School) 
		{
			// Dowcasnting
			School student = (School)person;// ClassCastException
			student.getResult();	
		}
		else if(person instanceof PublicPlace) 
		{
			PublicPlace citizen = (PublicPlace)person;
			citizen.getPublicEventInfo();
		}
		else if(person instanceof Org) 
		{
			Org emp = (Org)person;
			emp.getSalary();
		}
		else if(person instanceof Home) 
		{
			Home child = (Home)person;
			child.getMoviewOnTime();
		}

	}
/*	
	public static void getBehaveByPlaced(School school) 
	{
		school.getBehave();
	}
	public static void getBehaveByPlaced(PublicPlace obj) 
	{
		obj.getBehave();
	}
	public static void getBehaveByPlaced(Org org) 
	{
		org.getBehave();
	}
	public static void getBehaveByPlaced(Home home) 
	{
		home.getBehave();
	}
*/	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPLace");
		System.out.println("4) For Home");
		int choice = sc.nextInt();
		
		Person person = null;
		
		switch(choice) 
		{
			case 1: person = new School();
					getBehaveByPlaced(person);	
					break;
					
			case 2: person = new Org();
					getBehaveByPlaced(person);
					break;
					
			case 3: person = new PublicPlace();
					getBehaveByPlaced(person);
					break;
					
			case 4: person = new Home();
					getBehaveByPlaced(person);
					break;
		}
	}
}