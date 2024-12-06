package UseOf_Static_NonStatic;
public class EmployeeData 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp("amol", 101, "abc");
		Emp e2=new Emp("Rohan", 102, "abc");
		Emp e3=new Emp("pallavi", 103, "xyz");
		
		e1.empInfo();
		e2.empInfo();
		e3.empInfo();		
	}
}
