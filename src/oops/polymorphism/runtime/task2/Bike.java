package oops.polymorphism.runtime.task2;

public class Bike extends Vehicle
{
	boolean helmetIncluded;
	
	public void startVehicle()
	{
		System.out.println("Bike : Start Vehicle ");
	}
	public void showDetails()
	{
		helmetIncluded = true;
		System.out.println("Bike : Show car Vehicle Info : helmetIncluded : " +helmetIncluded);
	}
	public void provideHelmet() 
	{
		System.out.println("Bike : provideHelmet : " + helmetIncluded);
	}
}
