package Methods;
public class Sample7 
{
	//5: method without/zero parameter
	
	public static void main(String[] args) 
	{
		//1: static method call from same class
		m1();
		
		//2: static method call from diff class
		Sample8.m2();
		
		//3: non-static method call from same class
		Sample7 s7=new Sample7();
		s7.m3();
		
		
		//4: non-static method call from diff class
		Sample8 s8=new Sample8();
		s8.m4();		
	}
	
	public static void m1()  //without/zero parameter method
	{
		System.out.println("static method m1 from same class");
	}
	
	public void m3()    //without/zero parameter method
	{
		System.out.println("non-static method m3 from same class");
	}
}
