package oops.classndobj.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Employee Data : ");
		
		System.out.println("Enter Employee Id : ");
		e1.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		e1.name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		e1.salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		e1.dsgn = sc.nextLine();
		System.out.println("Enter Employee OrgName : ");
		e1.orgName = sc.nextLine();

		System.out.println("Second Employee Data : ");
		
		System.out.println("Enter Employee Id : ");
		e2.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		e2.name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		e2.salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		e2.dsgn = sc.nextLine();
		System.out.println("Enter Employee OrgName : ");
		e2.orgName = sc.nextLine();

		System.out.println(e1.id+" " +e1.name+" " + e1.salary+" " + e1.dsgn+" " + e1.orgName);
		System.out.println(e2.id+" " +e2.name+" " + e2.salary+" " + e2.dsgn+" " + e2.orgName);
		
	}
}
