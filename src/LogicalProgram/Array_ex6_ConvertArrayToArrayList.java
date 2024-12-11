package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class Array_ex6_ConvertArrayToArrayList
{
	public static void main(String[] args) 
	{
		int ar1 []= {10,30,40,50};
	
		List<int[]> al = Arrays.asList(ar1);
		
		System.out.println(al.get(0));
	}
}