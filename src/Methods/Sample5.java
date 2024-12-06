package Methods;

public class Sample5 
{
	//4: non-static method call from diff class
	
	public static void main(String[] args)
	{
		Sample6 s6=new Sample6();    //1: create object of diff class
		s6.m7();                     //2: method call -> diffClassObjectName.methodname();
		s6.m8();
		s6.m8();  	
	}
}
