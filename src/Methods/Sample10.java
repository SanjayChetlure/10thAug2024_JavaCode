package Methods;

public class Sample10 
{
	public static void main(String[] args) 
	{
		studentName("rahul");
		studentName("amol");
		
		studentFullName("abc1", "xyz1");
		studentFullName("abc12", "xyz2");
		
		System.out.println("----------");
		
		Sample11.studentInfo("Amol", 101, 67.5f, 'A');
		Sample11.studentInfo("Tushar", 102, 58.2f, 'B');
	}
	
	//method with String parameter
	public static void studentName(String name)   //name= rahul
	{
		System.out.println(name);
	}
	
	//method with String,String(2 String) parameter
	public static void studentFullName(String fn, String ln)  
	{
		System.out.println(fn+", "+ln);
	}
}
