package Constructor;
public class Sample8
{
	
	int num1;  
	int num2;   
	String sname;    
	
	
	Sample8(int a, int b, String s1)   
	{
		num1=a;   
		num2=b;   
		sname=s1;
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
		Sample8 s8=new Sample8(10, 20,"Uma");
		s8.studentName();
		
	}

}
