package Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class ex2_Vector
{
	public static void main(String[] args) 
	{
		Vector V=new Vector();   //initial capacity=10
		V.add("rahul");
		V.add(101);
		V.add(65.5f);
		V.add('A');
		V.add(null);
		V.add(101);
		V.add(null);
				
		System.out.println(V.capacity());  //10
		System.out.println(V);
		System.out.println(	V.get(0));
		System.out.println(V.size());
		System.out.println(V.isEmpty());
		System.out.println(V.contains(101));
		
		//update data
		V.set(0, "RAHUL");
		System.out.println(V);
		
		//add data in between vector  --> right shift operation
		V.add(4, 500);
		System.out.println(V);
				
		//remove data in between vector  --> left shift operation
		V.remove(4);
		System.out.println(V);
		
		System.out.println("----print data using: for loop----");
		for(int i=0; i<=V.size()-1; i++)
		{
			System.out.println(V.get(i));
		}
		
		System.out.println("----print data using: for each loop----");
		for(Object s1:V)
		{
			System.out.println(s1);
		}
		
		
		System.out.println("----print data using Iterator cursor:----");
		Iterator itr = V.iterator();   //[RAHUL, 101, 65.5, A, null, 101, null]
			
		while(itr.hasNext())   //true , false
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print data using ListIterator cursor:----");
		ListIterator litr = V.listIterator();  //[RAHUL, 101, 65.5, A, null, 101, null]
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("----print data using Enumeration cursor:----");
		Enumeration enu = V.elements();  //[RAHUL, 101, 65.5, A, null, 101, null]
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		V.clear();
		System.out.println(V.size());
	}
}
