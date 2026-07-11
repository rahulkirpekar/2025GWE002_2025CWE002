package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a1[][] = new int[3][5];
		
		// Student--3
		for (int i = 0; i < a1.length; i++) 
		{
			// Subjects--5
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : " );
				a1[i][j] = sc.nextInt();
			}
		}
		
		// Student--3
		for (int i = 0; i < a1.length; i++) 
		{
			// Subjects--5
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a1[i][j] );
			}
		}
		

//		int [][]a2 = new int[3][5];

//		int[][] a3 = new int[3][5];

//		int [][] a4 = new int[3][5];

		int []a5[] = new int[3][5];

//		int a6[][] = null;
//		a6 = new int[3][5];
//	-------------------------------------------------------------------------
//		int a7[][] = new int[][]
//					{
//						{10,20,30,40,50},
//						{10,20,30,40,50},
//						{10,20,30,40,50}
//					};
					
//		int a8[][] = 
//					{
//						{10,20,30,40,50},
//						{10,20,30,40,50},
//						{10,20,30,40,50}
//					};
		
	}
}
