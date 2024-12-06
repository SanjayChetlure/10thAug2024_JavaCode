package Access_Specifier;

public class Test5 
{
	protected int num;     		
	
	
	protected Test5()			
	{
		num=20;
	}
		
	protected void squareOfNum()   
	{
		System.out.println(num*num);
	}

	
	public static void main(String[] args)
	{
		Test5 t5=new Test5();
		t5.squareOfNum();
		System.out.println(t5.num);
	}
}
