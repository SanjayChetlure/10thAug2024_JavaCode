package Constructor;
public class Sample5 
{
	//3: user defined with parameter constructor
	 
	int num1;     //100
	int num2;     //200
	
	//constructor with 2 int(int int) parameter
	Sample5(int a, int b)         //a=100, b=200
	{
		num1=a;  //100        //globalVariable=localVariable -> assign local variable info into global variable
		num2=b;  //200
	}	
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void mult() 
	{
		System.out.println(num1*num2);
	}
	
	
	public static void main(String[] args) 
	{
		Sample5 s5=new Sample5(10, 20);      
		s5.add();
		s5.mult();
		
		System.out.println("------");
		
		Sample5 s6=new Sample5(50, 60);
		s6.add();
		s6.mult();
		
		System.out.println("----------------");
		
		Sample6 s7=new Sample6(5, 9);
		s7.sub();
		
		Sample6 s8=new Sample6(100, 80);
		s8.sub();
	}
}
