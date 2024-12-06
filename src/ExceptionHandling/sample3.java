package ExceptionHandling;
public class sample3
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		
		try
		{
			System.out.println(s1.charAt(8));      //risky code
		}
		catch(StringIndexOutOfBoundsException b)
		{
			System.out.println(s1.charAt(0));		//alternate code
		}
		
		System.out.println("Hi");
	}
}
