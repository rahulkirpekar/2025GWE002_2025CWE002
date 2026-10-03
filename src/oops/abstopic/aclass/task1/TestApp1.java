package oops.abstopic.aclass.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Polymorphic Object
		// Parent reference = Child Object
		A objA = new C();
		
		objA.test1();
		objA.test2();
		objA.test3();
		    
		objA.test4();
		objA.test5();
		objA.test6();

		if(objA instanceof C) 
		{
			C objC = (C)objA;
			
			objC.test7();
			objC.test8();
		}
	}
}
