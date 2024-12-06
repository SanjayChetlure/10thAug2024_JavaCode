package Array;
import java.util.Arrays;
public class ex11
{
	public static void main(String[] args) 
	{		
		int [] ar=new int[4];   
		ar[0]=40;      //10
		ar[1]=20;      //20
		ar[2]=10;      //30
		ar[3]=30;      //40
		
		Arrays.sort(ar);
				
		System.out.println(ar[0]);
		System.out.println(ar[ar.length-1]);

	}
}
