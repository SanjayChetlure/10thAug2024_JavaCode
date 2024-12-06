package Array;
public class ex7_intArray_DeclarationInitializationInSingleStep
{
	public static void main(String[] args) 
	{		
		int [] ar= {30,10,40,20};      //length=4
		
		System.out.println(ar[3]);     //20
		System.out.println(ar.length);     //4
		
		
		System.out.println("-------");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
	}
}
