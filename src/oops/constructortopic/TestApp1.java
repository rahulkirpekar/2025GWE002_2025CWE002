package oops.constructortopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// s - reference variable
		// Student--Object
		
		Student s1 = new Student(1,"Ankur",12,100);	
		s1.dispData();
		
		Student s2= new Student(s1);
		s2.dispData();
	}	
}
