package Access_Specifier;

public class Test11
{
	public int num;     		
	
	
	public Test11()			
	{
		num=30;
	}
		
	public void squareOfNum()   
	{
		System.out.println(num*num);
	}

	
	public static void main(String[] args)
	{
		Test11 t11=new Test11();
		t11.squareOfNum();
		System.out.println(t11.num);
	}
}
