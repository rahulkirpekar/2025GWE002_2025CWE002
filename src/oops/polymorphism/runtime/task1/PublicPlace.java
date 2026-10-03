package oops.polymorphism.runtime.task1;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace--getBehave() -- Citizen Behaviour");
	}
	
	public void getPublicEventInfo() 
	{
		System.out.println("PublicPlace - getPublicEventInfo()--Public Event Info");
	}
}
