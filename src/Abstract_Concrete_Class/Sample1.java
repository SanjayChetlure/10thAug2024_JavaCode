package Abstract_Concrete_Class;

// abstract class or incomplete class
abstract public class Sample1 
{
	//complete method
	public void m1()     //method declaration
	{
		System.out.println("method m1 complete in abstract class");		//method body
	}
	
	public void m2()     //method declaration
	{
		System.out.println("method m2 complete in abstract class");		//method body
	}
	
	//incomplete method
	abstract public void m3() ;       //only method declaration
	
	//incomplete method
	abstract public void m4() ;       //only method declaration
}
