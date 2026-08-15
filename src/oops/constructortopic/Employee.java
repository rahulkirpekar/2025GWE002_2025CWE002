package oops.constructortopic;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgName;
	
	public Employee() 
	{
		System.out.println("======START : Default Constructor======");	
	}
	public Employee(int id, String name) 
	{
		this();
		System.out.println("======START : PARA(TWO) Constructor======");	
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, int salary) 
	{
		this(id, name);
		System.out.println("======START : PARA(THREE) Constructor======");	
		this.salary = salary;
	}
	
	public Employee(int id, String name, int salary, String dsgn) 
	{
		this(id, name, salary);
		System.out.println("======START : PARA(FOUR) Constructor======");	
		this.dsgn = dsgn;
	}
	public Employee(int id, String name, int salary, String dsgn, String orgName) 
	{
		this(id,name,salary,dsgn);
		System.out.println("======START : PARA(FIVE) Constructor======");	
		this.orgName = orgName;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + orgName);
	}
}
