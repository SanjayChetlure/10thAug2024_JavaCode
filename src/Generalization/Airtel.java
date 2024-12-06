package Generalization;
//IC3
public class Airtel implements SimCard
{
	public void msg()
	{
		System.out.println("sms: 30");
	}

	public void audioCalling() 
	{
		System.out.println("audio Calling: 300 calls");
	}

	public void Data() 
	{
		System.out.println("Data: 3GB");
	}
}
