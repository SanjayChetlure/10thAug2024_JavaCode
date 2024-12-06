package Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex3_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add("rahul");
		ll.add(101);
		ll.add(65.5f);
		ll.add('A');
		ll.add(null);
		ll.add(101);
		ll.add(null);
				
		System.out.println(ll);
		System.out.println(	ll.get(2));
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(101));
		
		//update data
		ll.set(3, "B");
		System.out.println(ll);
		
		//add data in between linkedList 
		ll.add(4, 500);
		System.out.println(ll);
				
		//remove data in between linkedList 
		ll.remove(4);
		System.out.println(ll);
		
		System.out.println("----print data using: for loop----");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("----print data using: for each loop----");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
		
		System.out.println("----print data using Iterator cursor:----");
		Iterator itr = ll.iterator();   //[RAHUL, 101, 65.5, A, null, 101, null]
			
		while(itr.hasNext())   //true , fllse
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print data using ListIterator cursor:----");
		ListIterator litr = ll.listIterator();  //[RAHUL, 101, 65.5, A, null, 101, null]
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		ll.clear();
		System.out.println(ll.size());	
	}
}
