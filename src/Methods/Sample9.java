package Methods;

public class Sample9 
{
	//6: method with parameter	
	public static void main(String[] args) 
	{
		add(10,20);
		add(5,6);
		add(70,80);
		
		System.out.println("-----");
		
		Sample9 s9=new Sample9();
		s9.squareOfNum(4);
		s9.squareOfNum(9);
	}
	
	//method 2 int (int, int) parameter
	public static void add(int num1, int num2) // num1=70,  num2=80
	{
		System.out.println("Addition of 2 num:" +(num1+num2));    //70+80
	}
	
	public void squareOfNum(int a)   //a=9; 
	{
		System.out.println(a*a);     //9*9=
	}
}
