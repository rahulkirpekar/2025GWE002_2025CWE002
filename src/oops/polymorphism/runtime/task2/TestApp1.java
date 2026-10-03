package oops.polymorphism.runtime.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static void getVehicleDetails(Vehicle vehicle) 
	{
		vehicle.startVehicle();
		vehicle.showDetails();
			
		if (vehicle instanceof Car) 
		{
			Car car= (Car)vehicle;
			car.enableAC();
		}
		else if(vehicle instanceof Bike) 
		{
			Bike bike= (Bike)vehicle;
			bike.provideHelmet();
		}
		else if(vehicle instanceof ElectricVehicle) 
		{
			ElectricVehicle ev= (ElectricVehicle)vehicle;
			ev.checkBatteryHealth();
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Vehicle : ");
		System.out.println("1) For Car");
		System.out.println("2) For Bike");
		System.out.println("3) For ElectricVehicle");
		int choice= sc.nextInt();
		
		Vehicle vehicle = null;
		switch(choice) 
		{
			case 1: vehicle = new Car();
					getVehicleDetails(vehicle);
					break;
					
			case 2: vehicle = new Bike();
					getVehicleDetails(vehicle);
					break;
					
			case 3: vehicle = new ElectricVehicle();
					getVehicleDetails(vehicle);
					break;
		}
	}
}
