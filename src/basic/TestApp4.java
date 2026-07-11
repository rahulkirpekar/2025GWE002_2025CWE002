package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a1[][] = new int[][] 
				{
					{1,2,3},
					{4,5,6},
					{7,8,9}
				};
		
		// Student--3
		for (int i = 0; i < a1.length; i++) 
		{
			// Subjects--5
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.print(a1[i][j] +"\t");
			}
			System.out.println();
		}
	}
}