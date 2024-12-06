package Constructor;
public class Sample6 
{
	int num3;      //5
	int num4;     //9
	
	//with 2 int parameter cosntructor
	Sample6(int c, int d)   //c=5, d=9
	{
		num3=c;   //5
		num4=d;   //9
	}
	
	public void sub()
	{
		System.out.println(num3-num4);   //5-9 = -4
	}
}
