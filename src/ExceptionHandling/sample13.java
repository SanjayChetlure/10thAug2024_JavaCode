package ExceptionHandling;
public class sample13
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		
		try
		{
			System.out.println(s1.charAt(9));      //risky code
		}
		catch(StringIndexOutOfBoundsException e)
		{
			//empty catch block body
		}
		
		System.out.println("Hi");
	}
}
