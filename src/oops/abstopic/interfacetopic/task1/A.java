package oops.abstopic.interfacetopic.task1;

public interface A 
{
//	1. Constant Variables(public static final)
	
	public static final int NO1 = 10;// public static final --Constant variables
	public final int NO2 = 10;// static 
	public static int NO3 = 10;// final 
	public int NO4 = 10;// static final 
	int NO5 = 10;// public static final 
	
//	2. Member Function
	
//		1. Abstract Methods(public abstract)
	 public abstract void test1();// public abstract
	 public void test2();// abstract
	 abstract void test3();// public
	 void test4();// public abstract
	
//		2. Non-Abstract Methods(static(8),default(8),private(9))
	
	 static void test5() 
	 {
		 System.out.println("A--static--test5()");
	 }
	 default void test6() 
	 {
		 test7();
		 System.out.println("A--default--test6()");
		 test7();
	 }
	 private void test7() 
	 {
		 System.out.println("A--private--test7()");
	 }
}