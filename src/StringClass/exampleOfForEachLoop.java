package StringClass;
public class exampleOfForEachLoop 
{
	public static void main(String[] args) 
	{
		String [] ar= {"ganesh", "mahesh", "ramesh", "rahul"};
		
		for(String s1:ar)
		{
			System.out.println(s1);
		}
		
		System.out.println("----------");
		
		int [] ar1= {10,50,60,20,40};
		
		for( int num:ar1)
		{
			System.out.println(num);
		}	
	}
}
