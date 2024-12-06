package ExceptionHandling;
public class sample11 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		int div=0;
				
		try
		{
			 div=a/b;  	   //10/0=		risky code
		}
		catch(ArithmeticException e)
		{
			//empty catch block body
		}
		
		System.out.println(div);
		System.out.println("Hello GM");
	}
}
