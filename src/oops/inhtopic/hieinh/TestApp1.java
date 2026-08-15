package oops.inhtopic.hieinh;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul", 12, 100);
		s1.dispData();
		
		Employee e1 = new Employee(1, "Ankur", 2345, "Dr");
		e1.dispData();
	}
}
