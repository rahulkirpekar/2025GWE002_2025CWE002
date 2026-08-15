package oops.classndobjnfmethod.task3;

import java.util.Scanner;

// Pure Encapsulation
//---------------------
// 1. Data Members-----private
// 2. Member Function--public

// 1. Data Security
// 2. Code Reusibility

public class Product 
{
	private int id;
	private String productName;
	private double price;
	private int qty;
	private double totalStockPrice;
	
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name: ");
		productName = sc.nextLine();
		System.out.println("Enter Product Price : ");
		price = sc.nextDouble();
		System.out.println("Enter Product Qty : ");
		qty = sc.nextInt();
		
		calculateTotalStockPrice();
	}
	void calculateTotalStockPrice()
	{
		totalStockPrice = qty * price;
	}
	public void dispData() 
	{
		System.out.println(id+ " " + productName+" " + price+" " + qty+" " + totalStockPrice);
	}
}





