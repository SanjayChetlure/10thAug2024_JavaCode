package Array;
public class ex2_IntArray
{
	public static void main(String[] args) 
	{		
		int [] ar=new int[4];   // 0 to 3
		ar[0]=40;
		ar[1]=20;
		ar[2]=10;
		ar[3]=30;
				
		System.out.println(ar.length);
		System.out.println(ar[2]);
		
		System.out.println("------");
		
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
//		for(int s1:ar)
//		{
//			System.out.println(s1);
//		}
	}
}
