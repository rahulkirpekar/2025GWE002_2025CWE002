package oops.constructortopic;

// Constructor Overloadding(Different-Different Version of Constructor)
//------------------------------------------------------------------------
public class Student 
{
	// Data Members - private---Increase DataSecurity
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// 1. Default Constructor
	Student()
	{
		System.out.println("====START Default Constructor====");
		dispData();
		
		rno = 1;
		name = "Ganesh";
		std = 12;
		marks = 100;
		
		dispData();
		System.out.println("====EXIT Default Constructor====");
	}
	// 2. Default Constructor
	
	Student(int rno,String name)
	{
		System.out.println("====START PARA(TWO) Constructor====");		
		
		this.rno = rno;
		this.name = name;
		
		System.out.println("====EXIT PARA(TWO) Constructor====");		
	}
	
	Student(int rno,String name,int std)
	{
		System.out.println("====START PARA(THREE) Constructor====");		
		
		this.rno = rno;
		this.name = name;
		this.std = std;
		
		System.out.println("====EXIT PARA(THREE) Constructor====");		
	}
	
	Student(int rno,String name,int std,int marks)
	{
		System.out.println("====START PARA(FOUR) Constructor====");		
		
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		
		System.out.println("====EXIT PARA(FOUR) Constructor====");		
	}
	
	Student(Student s)
	{
		System.out.println("====START PARA(COPY) Constructor====");		
		
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		this.marks = s.marks;
		
		System.out.println("====EXIT PARA(COPY) Constructor====");		
	}
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+"---"+this);
	}
}
