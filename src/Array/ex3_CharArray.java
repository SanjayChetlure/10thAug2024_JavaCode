package Array;
public class ex3_CharArray
{
	public static void main(String[] args) 
	{		
		char [] ar=new char[4];   // 0 to 3
		ar[0]='B';
		ar[1]='A';
		ar[2]='D';
		//ar[3]='C';
		
		System.out.println(ar.length);
		System.out.println(ar[2]);
		
		System.out.println("-------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}		
	}
}
