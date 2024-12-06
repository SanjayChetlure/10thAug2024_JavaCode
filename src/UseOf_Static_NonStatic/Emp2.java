package UseOf_Static_NonStatic;
public class Emp2 
{
	String empName;
	int empId;
	static String empCEOName;
	
	Emp2(String name, int id)
	{
		empName=name;
		empId=id;
	}
		
	public void empInfo() 
	{
		System.out.println(empName+ " : "+empId+" : "+empCEOName);
	}
}
