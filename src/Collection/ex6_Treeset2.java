package Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class ex6_Treeset2
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet();
		ts.add(104);
		ts.add(102);
		ts.add(101);
		ts.add(107);
		ts.add(105);
		ts.add(103);
		ts.add(106);
		ts.add(104);
		
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------");
		
		Iterator<Integer> ditr = ts.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
	}
}
