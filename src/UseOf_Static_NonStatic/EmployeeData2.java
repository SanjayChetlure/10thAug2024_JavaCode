package UseOf_Static_NonStatic;
public class EmployeeData2 
{
	public static void main(String[] args) 
	{
		Emp2 e1=new Emp2("amol", 101);	
		Emp2.empCEOName="abc";
		
		Emp2 e2=new Emp2("Rohan", 102);
		Emp2.empCEOName="abc";
		
		Emp2 e3=new Emp2("pallavi", 103);
		Emp2.empCEOName="xyz";
				
		e1.empInfo();
		e2.empInfo();
		e3.empInfo();		
	}
}
