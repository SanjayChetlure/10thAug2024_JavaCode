package ExceptionHandling;
public class sample7
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		try
		{
			System.out.println(s1.charAt(9));      //risky code1
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handeld");
		}
		System.out.println("Hi");
		
				
		String [] ar= {"mahesh","ramesh","suresh"};	
		try
		{
			System.out.println(ar[9]);      //risky code2
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}		
		
		System.out.println("Hello");	
	}
}
