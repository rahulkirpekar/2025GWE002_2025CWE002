package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int no = sc.nextInt();

		int fc=0;
		
		for (int i = 1; i <=no ; i++) 
		{
			if(no%i == 0) 
			{
				System.out.print(i+" ");
				fc++;	
			}
		}
		System.out.println("\nTotal Factor count : "+fc);
		if(fc==2) 
		{
			System.out.println("\nNo is Prime : "+no);	
		}else 
		{
			System.out.println("\nNo is not Prime : "+no);	
		}
	}
}