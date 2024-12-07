package LogicalProgram;
public class String_ex2_ReverseEachWordInStatement2
{
	public static void main(String[] args)
	{
		String s1="my name is abc";   // ym eman si cba
		String [] ar=s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{   
			String org=ar[i]; 
			String rev1=revString(org);
			System.out.print(rev1+" ");   //ym  eman
		}
	}
	
	
	public static String revString(String org)
	{
		String rev="";
		for(int j=org.length()-1; j>=0; j--)
		{
			rev=rev+org.charAt(j);
		}
		return rev;
	}
}