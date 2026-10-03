package oops.polymorphism.runtime.task1;

public class Home extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Home--getBehave() -- Child Behaviour");
	}
	public void getMoviewOnTime() 
	{
		System.out.println("Home : getMoviewOnTime() - Moview Time");
	}
}
