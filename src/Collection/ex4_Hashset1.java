package Collection;
import java.util.HashSet;
import java.util.Iterator;
public class ex4_Hashset1
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("rahul");
		hs.add(101);
		hs.add('A');
		hs.add(65.5f);
		hs.add(null);
		hs.add(101);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(101));
		
		hs.remove('A');
		System.out.println(hs);
		
		System.out.println("-----print data using: for each------");
		for(Object s2: hs)
		{
			System.out.println(s2);
		}
		
		System.out.println("-----print data using: Iterator cursor------");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("------------");
		hs.clear();
		System.out.println(hs);
		
	}

}
