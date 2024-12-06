package StringClass;
public class StringClassMethods1
{
	public static void main(String[] args)
	{
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="my name is abc";
		String s5="";
		String s6="abcaba";
		
		System.out.println(s5.isEmpty());    //true
		System.out.println(s1.charAt(2));    //l
		System.out.println(s6.indexOf('b'));
		System.out.println(s6.lastIndexOf('b'));
		System.out.println("-------");
		
		System.out.println(s1.substring(4));    //city
		System.out.println(s1.substring(4,6));  // 4 to 5    (SI, (EI+1))
		
		System.out.println("-------");
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());  //VELOCITY
//		s1=s1.toUpperCase();
//		System.out.println(s1);
		System.out.println(s2.toLowerCase());     //abcd
//		s2=s2.toLowerCase();
//		System.out.println(s2);
		System.out.println("-------");		
		System.out.println(s2.equals(s3));  		 	 //false   compare data & case
		System.out.println(s2.equalsIgnoreCase(s3));     //true    compare only data   
		System.out.println("----");
		System.out.println(s4.contains("my"));        //true
		System.out.println(s4.startsWith("my"));      //true
		System.out.println(s4.endsWith("abc"));    	  //true
	}
}
