package oops.classndobjnfmethod.task3;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Object with Array
		Product p[] = new Product[3];
		
		for (int i = 0; i < p.length; i++) 
		{
			// i--[0,1,2]
			p[i] = new Product();
			p[i].scanData();
		}
		for (int i = 0; i < p.length; i++) 
		{
			p[i].dispData();
		}
	}
}
