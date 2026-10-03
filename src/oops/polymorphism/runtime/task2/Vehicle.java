package oops.polymorphism.runtime.task2;

import java.util.Scanner;

// Parent Class
public class Vehicle 
{
	int vehicleId   ;
	String brand    ;
	float rentPerDay,totalRent;

	public void startVehicle()
	{
		System.out.println("Vehicle : Started");
	}
	public void calculateRent(int days) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Vehicle Id : ");
		vehicleId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Vehicle BrandName : ");
		brand = sc.nextLine();
		System.out.println("Enter Vehicle Rent Per Day : ");
		rentPerDay = sc.nextFloat();
		
		totalRent = rentPerDay * days;
		
	}
	public void showDetails() 
	{
		System.out.println("Vehicle Id : " + vehicleId);
		System.out.println("Vehicle Brand Name : " + brand);
		System.out.println("Vehicle  Rent Per Day : " + rentPerDay);
		System.out.println("Vehicle  Total Rent : " + totalRent);
	}
}
