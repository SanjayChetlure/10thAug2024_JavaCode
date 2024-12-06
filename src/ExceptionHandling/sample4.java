package ExceptionHandling;
public class sample4
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		
		try
		{
			System.out.println(s1.charAt(8));      //risky code
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(ArithmeticException b)
		{
			System.out.println("ArithmeticException Exception handled");
		}
		catch(StringIndexOutOfBoundsException b)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		System.out.println("Hi");
	}
}
