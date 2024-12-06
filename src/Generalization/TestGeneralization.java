package Generalization;
public class TestGeneralization 
{
	public static void main(String[] args) 
	{
		System.out.println("----Features of Jio Simcard-----");
		Jio j=new Jio();
		j.msg();
		j.audioCalling();
		j.Data();
		j.JioCinema();	
		j.m1();
		
		System.out.println("----Features of VI Simcard-----");
		VI v=new VI();
		v.msg();
		v.audioCalling();
		v.Data();
		v.hotstar();
		j.m1();
		
		System.out.println("----Features of Airtel Simcard-----");
		Airtel a=new Airtel();
		a.msg();
		a.audioCalling();
		a.Data();
	}
}
