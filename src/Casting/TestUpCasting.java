package Casting;
public class TestUpCasting 
{
	public static void main(String[] args)
	{
		
//		Son s=new Son();
//		s.mobile();
//		s.car();
//		s.money();
//		s.home();
				
		//Create Object of sub class with reference/dataType of super class
		Father s=new Son();    //upcasting
		s.car();
		s.money();
		s.home();		
	}
}
