package UseOf_Static_NonStatic;
public class Emp 
{
	String empName;
	int empId;
	String empCEOName;
	
	Emp(String name, int id, String ceo)
	{
		empName=name;
		empId=id;
		empCEOName=ceo;
	}
		
	public void empInfo() 
	{
		System.out.println(empName+ " : "+empId+" : "+empCEOName);
	}
}
