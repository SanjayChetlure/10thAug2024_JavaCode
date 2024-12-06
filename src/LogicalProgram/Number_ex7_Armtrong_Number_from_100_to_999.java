package LogicalProgram;
public class Number_ex7_Armtrong_Number_from_100_to_999
{
	public static void main(String[] args)
	{
		for(int i=100; i<=999; i++)
		{
			findArmstrongNum(i);
		}
	}
	
	
	
	public static void findArmstrongNum(int OrgNum) 
	{
		int sum = 0; 
		
		for (int i = OrgNum;	 i > 0; 	i = i / 10)
		{
			int rem = i % 10; 
			sum = sum + (rem * rem * rem); 
		}
		
		if (OrgNum == sum)
		{
			System.out.println("given number " + OrgNum + " is an armstrong number");
		}
	}
}
