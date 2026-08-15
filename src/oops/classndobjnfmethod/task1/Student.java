package oops.classndobjnfmethod.task1;

import java.util.Scanner;

// Member Function
//------------------
// 1. Data Security
// 2. Reduce Code Duplication

public class Student 
{
	// 1. Data Members
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// 2. Member Function
	public void scanData() 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();		
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std + " " + marks);
	}
}
