package oops.abstopic.interfacetopic.task1;

public class B implements A
{
	@Override
	public void test1() 
	{
		System.out.println("B - test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("B - test2()");
	}
	@Override
	public void test3() 
	{
		System.out.println("B - test3()");
	}
	@Override
	public void test4() 
	{
		System.out.println("B - test4()");
	}
	
	public static void main(String[] args) 
	{
		A obj = new B();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		// static way
		A.test5();
		
		obj.test6();
	}
}