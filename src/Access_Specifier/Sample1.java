package Access_Specifier;

public class Sample1 
{
	private int num;
	
	
	private Sample1()
	{
		num=10;
	}
		
	private void squareOfNum() 
	{
		System.out.println(num*num);
	}

	
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		s1.squareOfNum();
		System.out.println(s1.num);
	}
}
