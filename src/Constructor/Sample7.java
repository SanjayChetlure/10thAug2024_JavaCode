package Constructor;
public class Sample7 
{
	//4: constructor overloading 
	
	int num1;   //50
	int num2;   //60
	String sname;    //Uma
	
	Sample7()   //constructor without parameter
	{
		num1=10;
		num2=20;
	}
	
	Sample7(int a, int b)   //a=50 , b=60 //constructor with 2 int parameter
	{
		num1=a;    //50
		num2=b;    //60
	}
	
	
	Sample7(String s1)  // s1=Uma  //constructor with String parameter
	{
		sname=s1;   //Uma
	}
		
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	public void studentName()
	{
		System.out.println(sname);
	}
	
	public static void main(String[] args)
	{
		Sample7 s7=new Sample7();
		s7.add();
		s7.mult();
		
		System.out.println("---");
		
		Sample7 s8=new Sample7(50, 60);
		s8.add();
		s8.mult();
				
		System.out.println("--------");
		
		Sample7 s9=new Sample7("Uma");
		s9.studentName();	
	}
}
