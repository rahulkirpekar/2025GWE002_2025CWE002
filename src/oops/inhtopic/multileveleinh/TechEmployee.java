package oops.inhtopic.multileveleinh;

public class TechEmployee extends Employee
{
	String projectName;
	
	public TechEmployee() 
	{
		System.out.println("TechEmployee : Default Constructor");

		projectName = "NULL";
	}	
	
	public TechEmployee(int id,String name,int salary,String dsgn,String projectName) 
	{
		super(id, projectName, salary, dsgn);
		System.out.println("TechEmployee : PARA Constructor");
		this.projectName = projectName;
	}

	public void dispData()
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + projectName);
	}
	
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee(1,"Rahul",1222,"SE","Qatar Airways");
		
		techEmp.dispData();
	}
}
