package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		Array Declaration:-
//		-------------------
		int sum = 0;

		int a1[] = new int[5];
			
		System.out.println("a1 : " + a1);
			
		System.out.println("a1.length : " + a1.length);
			
			
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("Enter A1["+ i +"] : ");
			a1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("A1["+ i +"] : " + a1[i]);
			sum = sum + a1[i];
		}
		System.out.println("Sum of Array : " + sum);
			
//			int []a2 = new int[5];
//			int[] a3 = new int[5];
//			int [] a4 = new int[5];
//			int [] a5 = new int[5];

//			int a6[] = null;
//			a6 = new int[5];

//		Array Declaration With Initialisation:-
//		--------------------------------------

//			int a7[] = {10,20,30,40,50};

//			int a8[] = new int[]{10,20,30,40,50};

	}
}
