package LogicalProgram;
public class String_ex14_find_total_no_of_white_spaces_in_String
{
	public static void main(String[] args)
	{
		String str = "a b c d";
		int count = 0;
		
		//              1<=6
		for (int i = 0; i <= str.length() - 1; i++)
		{    //                 1
			char s1 = str.charAt(i);   // ' '
			
			if (s1 == ' ')   // ' ' == ' '  -> true
			{
				count++;   //1
			}
		}
		
		System.out.println("no of spaces in given string: " + count);
		//System.out.println(str.replace(" ", ""));
	}
}
