package ExceptionHandling;

public class example1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		int div=a/b;  //10/0  = 5      //risky code
		
		System.out.println(div);
		
		System.out.println("Hello GM");
	}
}
