package LogicalProgram;
public class String_ex12_removeNumbersFrom
{
	public static void main(String[] args)
	{
		String str="5abcd123xyz #"; 
		String str1=""; 
		
		for(int i=0; i<=str.length()-1; i++)
		{              
			char s1 = str.charAt(i);   
			
			if(!Character.isDigit(s1)) 
			{
				str1=str1+s1;     
			}
		}
		
		System.out.println(str1);
	}
}