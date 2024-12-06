package StringClass;
public class StringClassMethods2
{
	public static void main(String[] args)
	{
		String s1="velocity";
		String s2="abcd";
		String s3=" xyz abc ";
		String s4="my name is abc";
		
		
		System.out.println(s1+s2);     			//velocityabcd
		System.out.println(s1.concat(s2));		//velocityabcd
		
		System.out.println(s3);
		System.out.println(s3.trim());
		
		System.out.println(s4.replace("abc", "xyz"));  //my name is xyz
		
		
		 String [] ar=s4.split(" ");    //{my(0)    name(1)   is(2)   abc(3)}
		 
		 System.out.println(ar.length);   //4
		 System.out.println(ar[2]);   //is
		 
		 System.out.println("------------------");
		 
		 for(int i=0; i<=ar.length-1; i++)
		 {
			 System.out.println(ar[i]);
		 }		
	}
}
