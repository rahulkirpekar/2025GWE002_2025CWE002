package oops.classndobj.task1;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student obj1 = new Student();
		
		System.out.println("obj1 : " + obj1);// Fully Qualified ClassName@(Hexastring(hashCode))
		
		System.out.println("obj1.rno : " + obj1.rno);
		System.out.println("obj1.name : " + obj1.name);
		System.out.println("obj1.std : " + obj1.std);
		System.out.println("obj1.marks : " + obj1.marks);
		System.out.println("---------------------------------------------");
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Student Rno : ");
		obj1.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name : ");
		obj1.name = sc.nextLine();
		System.out.println("Enter Student Std : ");
		obj1.std = sc.nextInt();
		System.out.println("Enter Student Marks : ");
		obj1.marks = sc.nextInt();
		
		System.out.println("Student1 Object Data : ");
		System.out.println("obj1.rno : " + obj1.rno);
		System.out.println("obj1.name : " + obj1.name);
		System.out.println("obj1.std : " + obj1.std);
		System.out.println("obj1.marks : " + obj1.marks);
		System.out.println("---------------------------------------------");
		
		
		Student obj2 = new Student();
		
		System.out.println("obj2 : " + obj2);// Fully Qualified ClassName@(Hexastring(hashCode))
		
		
		System.out.println("obj2.rno : " + obj2.rno);
		System.out.println("obj2.name : " + obj2.name);
		System.out.println("obj2.std : " + obj2.std);
		System.out.println("obj2.marks : " + obj2.marks);
		System.out.println("---------------------------------------------");
		
		System.out.println("Enter Student Rno : ");
		obj2.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name : ");
		obj2.name = sc.nextLine();
		System.out.println("Enter Student Std : ");
		obj2.std = sc.nextInt();
		System.out.println("Enter Student Marks : ");
		obj2.marks = sc.nextInt();
		
		System.out.println("Student2 Object Data : ");
		System.out.println("obj2.rno : " + obj2.rno);
		System.out.println("obj2.name : " + obj2.name);
		System.out.println("obj2.std : " + obj2.std);
		System.out.println("obj2.marks : " + obj2.marks);
		System.out.println("---------------------------------------------");
	}
}
