package Polymorphism;
//sub/ child class 
public class Son extends Father
{
	//method overriding
	
	public void mobile()
	{
		System.out.println("Mobile: Samsung S20");
	}
	
	public void car()       //method overriding
	{
		System.out.println("car: BMW");
	}
	
	public void money()     //method overriding
	{
		System.out.println("money: 10k");
	}
	
//	public void home() 
//	{
//		System.out.println("home: 2BHK");
//	}

}
