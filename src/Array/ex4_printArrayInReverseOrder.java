package Array;
public class ex4_printArrayInReverseOrder
{
	public static void main(String[] args) 
	{		
		int [] ar=new int[4];   
		ar[0]=40;
		ar[1]=20;
		ar[2]=10;
		ar[3]=30;
		
		System.out.println("----original data---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		System.out.println("----reverse order---");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
