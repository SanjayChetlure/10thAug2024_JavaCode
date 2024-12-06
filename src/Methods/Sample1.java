package Methods;
public class Sample1 
{
	//1: static method call from same class
	
	//main method
	public static void main(String[] args)    //pre defined method
	{		
		System.out.println("Hi");		
		
		m1();
		m2();
		m2();
		
		System.out.println("hello");
	}
	
	
	//static ->regular method
	public static void m1()      //user defined
	{
		System.out.println("running static regular method m1 from same class");
	}	
	
	
	//static ->regular method
	public static void m2()      //user defined
	{
		System.out.println("running static regular method m2 from same class");
	}	
}
