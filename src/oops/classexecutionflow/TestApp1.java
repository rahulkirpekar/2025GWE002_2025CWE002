package oops.classexecutionflow;

// Class Execution Flow - JVM Load --Execution Flow
public class TestApp1 
{
	// 1. static Block
	static 
	{
		System.out.println("static Block : 1");
	}
	static 
	{
		System.out.println("static Block : 2");
	}
	
	// 3. static Method
	static void test1() 
	{
		System.out.println("3. TestApp1 : Static Method");
	}
	
	// 4. Instance Block-1
	{
		System.out.println("4. Instance Block : 1");	
	}
	{
		System.out.println("4.Instance Block : 2");	
	}
	
	// 5. Constructor--Default,Para
	TestApp1()
	{
		
		System.out.println("5.TestApp1 : Default Constructor");
	}
	TestApp1(int no)
	{
		System.out.println("5.TestApp1(int no) : Para Constructor");
	}
	
//	6. Non-static Method 
	void test2() 
	{
		System.out.println("6. TestApp1 : Non-Static Method");
	}
	public static void main(String[] args) 
	{
		System.out.println("2.=====START : main Function=====");
		
		TestApp1.test1();
		
		TestApp1 obj = new TestApp1(10);
		obj.test2();
		
		System.out.println("=====EXIT : main Function=====");
	}
}
