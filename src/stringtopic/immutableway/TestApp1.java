package stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		1. By String Literals Way(RAM----HEAP----SCP(String Constant Pool)--create String Objects):-
//		-------------------------------------------------------------------------------------------
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "technosoft";
		String name4 = name3;
		
		String name5 = "royaltechnosoft";

		String name6 = name1 + name3;// name1.concat(name3);// royaltechnosoft

		String name7 = name6;
		
		System.out.println("1. refernceBased(==) : ");
		System.out.println("----------------------------");
		
		System.out.println("name1 == name2 : " + (name1 == name2));// true
		System.out.println("name1 == name3 : " + (name1 == name3));// false 
		System.out.println("name1 == name4 : " + (name1 == name4));// false 
		System.out.println("name1 == name5 : " + (name1 == name5));// false
		System.out.println("name1 == name6 : " + (name1 == name6));// false
		System.out.println("name1 == name7 : " + (name1 == name7));// false
		System.out.println("name2 == name3 : " + (name2 == name3));// false
		System.out.println("name2 == name4 : " + (name2 == name4));// false
		System.out.println("name2 == name5 : " + (name2 == name5));// false
		System.out.println("name2 == name6 : " + (name2 == name6));// false
		System.out.println("name2 == name7 : " + (name2 == name7));// false
		System.out.println("name3 == name4 : " + (name3 == name4));// true
		System.out.println("name3 == name5 : " + (name3 == name5));// false
		System.out.println("name3 == name6 : " + (name3 == name6));// false
		System.out.println("name3 == name7 : " + (name3 == name7));// false
		System.out.println("name4 == name5 : " + (name4 == name5));// false
		System.out.println("name4 == name6 : " + (name4 == name6));// false
		System.out.println("name4 == name7 : " + (name4 == name7));// false
		System.out.println("name5 == name6 : " + (name5 == name6));// false
		System.out.println("name5 == name7 : " + (name5 == name7));// false
		System.out.println("name6 == name7 : " + (name6 == name7));// true
		                                                        
		
		System.out.println("2. ValueBased(==) : ");
		System.out.println("----------------------------");
		
		System.out.println("name1.equals(name2) : " + (name1.equals(name2)));// true
		System.out.println("name1.equals(name3) : " + (name1.equals(name3)));// false 
		System.out.println("name1.equals(name4) : " + (name1.equals(name4)));// false
		System.out.println("name1.equals(name5) : " + (name1.equals(name5)));// false
		System.out.println("name1.equals(name6) : " + (name1.equals(name6)));// false
		System.out.println("name1.equals(name7) : " + (name1.equals(name7)));// false
		System.out.println("name2.equals(name3) : " + (name2.equals(name3)));// false
		System.out.println("name2.equals(name4) : " + (name2.equals(name4)));// false
		System.out.println("name2.equals(name5) : " + (name2.equals(name5)));// false
		System.out.println("name2.equals(name6) : " + (name2.equals(name6)));// false
		System.out.println("name2.equals(name7) : " + (name2.equals(name7)));// false
		System.out.println("name3.equals(name4) : " + (name3.equals(name4)));// true
		System.out.println("name3.equals(name5) : " + (name3.equals(name5)));// false
		System.out.println("name3.equals(name6) : " + (name3.equals(name6)));// false
		System.out.println("name3.equals(name7) : " + (name3.equals(name7)));// false
		System.out.println("name4.equals(name5) : " + (name4.equals(name5)));// false
		System.out.println("name4.equals(name6) : " + (name4.equals(name6)));// false
		System.out.println("name4.equals(name7) : " + (name4.equals(name7)));// false
		System.out.println("name5.equals(name6) : " + (name5.equals(name6)));// true
		System.out.println("name5.equals(name7) : " + (name5.equals(name7)));// true
		System.out.println("name6.equals(name7) : " + (name6.equals(name7)));// true
		                                                        

//		2. By String 'new' keyword Way(RAM----HEAP) :-
//		-----------------------------------------------
		String name8 = new String("ankur");
		String name9 = new String("ankur");
		String name10 = name8;
		String name11 = new String("royal");

		
		
		System.out.println("1. refernceBased(==) : ");
		System.out.println("----------------------------");
		
		System.out.println("name8 == name9 		: " + (name8 == name9));// false
		System.out.println("name9 == name10 	: " + (name8 == name10));// true
		System.out.println("name10 == name11 	: " + (name10 == name11));// false 
		System.out.println("name9 == name10 	: " + (name9 == name10));// false
		System.out.println("name9 == name11 	: " + (name9 == name11));// false
		
		System.out.println("2. ValueBased(==) : ");
		System.out.println("----------------------------");
		System.out.println("name8.equals(name9)		: " + (name8.equals(name9)));// true
		System.out.println("name9.equals(name10) 	: " + (name8.equals(name10)));// true
		System.out.println("name10.equals(name11) 	: " + (name10.equals(name11)));// false
		System.out.println("name9.equals(name10) 	: " + (name9.equals(name10)));// false
		System.out.println("name9.equals(name11) 	: " + (name9.equals(name11)));// false
		System.out.println("name10.equals(name11) 	: " + (name10.equals(name11)));// false
		
	}
}
