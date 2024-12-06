package ExceptionHandling;
public class sample8
{
	public static void main(String[] args) 
	{
		String s1= "abcd";
		int a=10;
		int b=0;
				
		
		try                  //outer try block
		{
			try               //inner/nested try block
			{
				System.out.println(a/b);               //risky code1
			}
			catch (ArithmeticException e)   //inner catch block
			{
				System.out.println("Arithmetic Exception handled");
			}	
			
			System.out.println(s1.charAt(9));      //risky code2
		}
		catch(StringIndexOutOfBoundsException e)     //outer catch block
		{
			System.out.println("StringIndexOutOfBounds Exception handeld");
		}
		
		
		System.out.println("Hi");		
	}
}
