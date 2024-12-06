package Generalization;
//super interface
public interface SimCard 
{	
	void msg();  
	
	void audioCalling();
	
	void Data();
	
	default void m1()
	{
		System.out.println("method m1  created in Interface");
	}
}
