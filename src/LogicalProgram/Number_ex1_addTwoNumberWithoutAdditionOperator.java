package LogicalProgram;
public class Number_ex1_addTwoNumberWithoutAdditionOperator
{
	public static void main(String[] args)
	{
		System.out.println(add(6, 5));
	}
	
	public static int add(int num1, int num2)   //6,  5
	{
		//           7<=6
		for(int i=1; i<=num1; i++)
		{
			num2++;    //6 7 8 9 10 11
		}
		return num2;
	}
}
