package oops.abstopic.aclass.task1;

//  0% to 100% Abstraction
//----------------------------
public abstract class A 
{
	// 1. Data Members
	int no1;
	
	// 2. Constructors
	A()
	{
		System.out.println("A : Default Constructor");
	}
		
// 3. Member function
//------------------------
	
	//1. Abstract Methods
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	
	// 3. Non-Abstract Methods
	public void test4()
	{
		System.out.println("A : test4()");
	}
	public void test5()
	{
		System.out.println("A : test5()");
	}
	public void test6()
	{
		System.out.println("A : test6()");
	}
}
