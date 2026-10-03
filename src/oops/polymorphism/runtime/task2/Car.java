package oops.polymorphism.runtime.task2;

public class Car extends Vehicle
{
	public boolean hasSunroof ;
	
	public void startVehicle()
	{
		System.out.println("Car : Start Vehicle ");
	}
	public void showDetails()
	{
		hasSunroof = true;
		System.out.println("Car : Show car Vehicle Info : HasSunRoof : " +hasSunroof);
	}
	public void enableAC()
	{
		System.out.println("Car : enableAC() ");
	}
}
