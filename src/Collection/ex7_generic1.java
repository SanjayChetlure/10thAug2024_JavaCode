package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class ex7_generic1
{
	public static void main(String[] args) 
	{
			ArrayList<String> al=new ArrayList<String>();
			al.add("rahul");
			al.add("ganesh");
			al.add("suresh");
			//al.add(101);
			
			System.out.println(al);
			
			
			for(String s1:al)
			{
				System.out.println(s1);
			}
	}
}
