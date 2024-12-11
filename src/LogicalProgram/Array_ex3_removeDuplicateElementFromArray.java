package LogicalProgram;

import java.util.LinkedHashSet;

public class Array_ex3_removeDuplicateElementFromArray
{
	public static void main(String[] args) 
	{
		int ar []= {10,40,40,20,50,70,60,70};
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		for(int num:ar)
		{
			lhs.add(num);
		}
		
		System.out.println(lhs);
		
	}
}