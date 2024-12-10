package LogicalProgram;
import java.util.LinkedHashSet;
public class String_removeDuplicateCharFromString 
{
	public static void main(String[] args) 
	{
		String s1="abcdaba";
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();   //{a, b, c, d}
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			lhs.add(s1.charAt(i));
		}
		
		String newStr="";
		for(Character s3:lhs)
		{
			newStr=newStr+s3;
		}
		
		System.out.println(newStr);		
	}
}
