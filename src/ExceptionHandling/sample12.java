package ExceptionHandling;
public class sample12 
{
	public static void main(String[] args) 
	{
		String [] ar= {"mahesh","ramesh","suresh"};	
	
		try
		{
			System.out.println(ar[7]);      //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//empty catch block body
		}		
		
		System.out.println("Hi");		
	}
}
