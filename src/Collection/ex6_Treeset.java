package Collection;
import java.util.Iterator;
import java.util.TreeSet;
public class ex6_Treeset
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(104);
		ts.add(102);
		ts.add(101);
		ts.add(107);
		ts.add(105);
		ts.add(103);
		ts.add(106);
		ts.add(104);

		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains(101));
		
		ts.remove(104);
		System.out.println(ts);
		
		System.out.println(ts.first());       //get 1st position data
		System.out.println(ts.last());		  //get last position data
		
		
		ts.pollFirst();                //delete 1st position data
		System.out.println(ts);
		
		ts.pollLast();                //delete last position data
		System.out.println(ts);
		
		System.out.println("print data using: for each loop");
		for(Object s1:ts)
		{
			System.out.println(s1);
		}
		
		System.out.println("print data using: Iterator");
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------");
		ts.clear();
		System.out.println(ts.size());
	}
}
