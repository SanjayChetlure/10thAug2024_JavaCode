package ExceptionHandling;
public class sample5
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		
		try
		{
			System.out.println(s1.charAt(9));      //risky code
		}
		catch(Exception b)
		{
			b.printStackTrace();
			System.out.println("generic Exception handled");
		}
				
		System.out.println("Hi");
	}
}
