package LogicalProgram;
public class Number_ex1_MultTwoNumberWithoutMultOperator
{
	public static void main(String[] args)
	{
		int num1=4;      // 3+3+3+3=12
		int num2=3;      //4+4+4=12
		int sum=0;  //12
		
		//           5<=4
		for(int i=1; i<=num1; i++)
		{
			sum=sum+num2;   //9+3= 12
		}
		System.out.println(sum);
	}
}