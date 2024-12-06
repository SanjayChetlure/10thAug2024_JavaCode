package Array;
import java.util.Arrays;
public class ex5_intArraySorting
{
	public static void main(String[] args) 
	{		
		int [] ar=new int[4];   
		ar[0]=40;      //10
		ar[1]=20;      //20
		ar[2]=10;      //30
		ar[3]=30;      //40
		
		
		System.out.println("----original data---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
				
		Arrays.sort(ar);            //diffClassName.methodName();
		
		System.out.println("----ascending order---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
			
		System.out.println("----descending order---");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}	
	}
}
