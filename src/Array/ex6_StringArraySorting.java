package Array;
import java.util.Arrays;
public class ex6_StringArraySorting
{
	public static void main(String[] args) 
	{
		String [] ar=new String[5];   
		
		ar[0]="rahul";
		ar[1]="ganesh";
		ar[2]="ramesh";
		ar[3]="umesh";
		ar[4]="mahesh";
		
		System.out.println("----original data---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
				
		Arrays.sort(ar);          
		
		System.out.println("----alphabetical order---");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
