package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Array_ex2_findHighest_Smallest_NumberFromArray 
{
	public static void main(String[] args) 
	{
		int ar []= {10,30,40,50,50,60,60};
		
		Arrays.sort(ar);
		
		System.out.println(ar[0]);
		System.out.println(ar[ar.length-1]);
		
	}
}