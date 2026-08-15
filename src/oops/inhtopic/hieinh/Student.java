package oops.inhtopic.hieinh;

public class Student extends Person
{
	int rno,std,marks;
	
	public Student() 
	{
	}
	public Student(int rno, String name,int std, int marks) 
	{
		super(name);
		this.rno = rno;
		this.std = std;
		this.marks = marks;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}