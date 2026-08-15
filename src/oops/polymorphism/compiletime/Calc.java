package oops.polymorphism.compiletime;

// Compiletime Polymorphism
//---------------------------
// Method Overloadding

public class Calc 
{
	public void addFun(double no1,double no2)
	{
		System.out.println("Calc : addFun(double no1,double no2) "+ (no1+no2));
	}
	public void addFun(long no1,long no2)
	{
		System.out.println("Calc : addFun(long no1,long no2) "+ (no1+no2));
	}
	public void addFun(int no1,int no2,int no3)
	{
		System.out.println("Calc : addFun(int no1,int no2,int no3) "+ (no1+no2+no3));		
	}
	public void addFun(int no1,int no2,int no3,int no4)
	{
		System.out.println("Calc : addFun(int no1,int no2,int no3,int no4) "+ (no1+no2+no3+no4));		
	}
	public void addFun(int no1,int no2,int no3,int no4,int no5)
	{
		System.out.println("Calc : addFun(int no1,int no2,int no3,int no4,int no5) "+ (no1+no2+no3+no4+no5));		
	}
	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		
		obj.addFun('A', 'B');
		
	}
}
/*
Rule of Method Overloadding:-
-------------------------------
	1. method argument count
	2. argument count same :  excat DataType match
	3. Type pramotion Rule
	
	
	Pramotion Rule:-
	----------------
	boolean---X
	
			
			byte
			 |
			short
			 |
char------> int(default)
			 |
			long 
			 |
		    float	 
			 |
		   double(Fraction)	 
		   
	10.5432(double)		 	
	10.5432f = (float)		 	
			 	
			
	10(int)
	10l = (long)
	
	
	
	
	
	
	
	
	
	
	


*/