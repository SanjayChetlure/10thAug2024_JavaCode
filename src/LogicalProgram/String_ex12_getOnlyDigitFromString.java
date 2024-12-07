package LogicalProgram;
public class String_ex12_getOnlyDigitFromString
{
	public static void main(String[] args)
	{
		String str="abcd123"; 
		
		String s1=str.substring(4);  // 123
		
		int num1 = Integer.parseInt(s1);      //String -> int
		
		System.out.println(num1+7);   //130
		
	}
}