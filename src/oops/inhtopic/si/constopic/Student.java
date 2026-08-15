package oops.inhtopic.si.constopic;

// Single Inheritance
//----------------------
public class Student extends Person
{
	int rno,std,marks;
	
	double attendence,aper;
	
	public Student() 
	{
		System.out.println("Student : Default Constructor");
	}
	public Student(int rno,String name,int std,int marks,double attendence) 
	{
		super(name);
		System.out.println("Student : Para Constructor");
		this.rno=rno;
		this.std=std;
//		super.name=name;
		this.marks=marks;
		this.attendence=attendence;
		
		aper = calculateAttendenceAvg();
	}
	
	public double calculateAttendenceAvg() 
	{
		aper = (attendence * 100 ) / 26;
		return aper;
	}
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+" " + aper+"%.");
	}
}
