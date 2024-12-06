package ExceptionHandling;
public class sample9
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		try
		{
			System.out.println(s1.charAt(9));      //risky code1
			//data fetch
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handeld");
			
		}
		finally 
		{
			//connection close
			System.out.println("running ");
		}
				
		System.out.println("Hi");
			
	}
}
