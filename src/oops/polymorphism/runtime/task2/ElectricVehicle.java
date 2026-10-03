package oops.polymorphism.runtime.task2;

public class ElectricVehicle extends Vehicle
{
	int batteryPercentage;
	
	
	public void startVehicle()
	{
		System.out.println("ElectricVehicle : Start Vehicle ");
	}
	public void showDetails()
	{
		batteryPercentage = 90;
		System.out.println("ElectricVehicle : Show car Vehicle Info : batteryPercentage : " +batteryPercentage);
	}
	
	public void checkBatteryHealth() 
	{
		System.out.println("ElectricVehicle : checkBatteryHealth Okay");
		
	}
}
