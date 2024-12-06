package Array;
public class ex8_StringArray_DeclarationInitializationInSingleStep
{
	public static void main(String[] args) 
	{		
		String [] ar= {"mahesh", "ganesh", "suresh", "ramesh"};      //length=4
		
		System.out.println(ar[3]);     //ramesh
		System.out.println(ar.length);     //4
				
		System.out.println("-------");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
	}
}
