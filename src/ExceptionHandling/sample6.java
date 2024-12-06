package ExceptionHandling;
public class sample6
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		
		try
		{
			System.out.println(s1.charAt(9));      //risky code
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		catch(Exception b)
		{
			b.printStackTrace();
			System.out.println("generic Exception handled");
		}		
		
		System.out.println("Hi");
	}
}
