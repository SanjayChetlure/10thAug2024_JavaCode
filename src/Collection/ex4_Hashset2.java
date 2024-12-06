package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class ex4_Hashset2
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();   
		al.add("rahul");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(null);
		al.add(101);
		al.add(null);
		System.out.println(al);    //[rahul, 101, 65.5, A, null, 101, null]
		
		
		HashSet hs=new HashSet(al);   //[rahul, 101, 65.5, A, null]
		System.out.println(hs);
	}
}
