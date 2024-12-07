package LogicalProgram;
public class String_ex12_getOnlyNumersFromString
{
	public static void main(String[] args)
	{
		String str="5abcd123xyz #"; 
		String str1=""; //5
		
		for(int i=0; i<=str.length()-1; i++)
		{               //       1
			char s1 = str.charAt(i);    //1
			
			if(Character.isDigit(s1)) 
			{
				str1=str1+s1;     //5 + 1= 51
			}
		}
		
		int num1 = Integer.parseInt(str1);
		System.out.println(num1+2);
	}
}