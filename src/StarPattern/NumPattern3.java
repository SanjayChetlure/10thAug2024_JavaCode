package StarPattern;

public class NumPattern3
{
	public static void main(String[] args)
	{
		//123  
		//456
		
		int num=1;
		
		for(int i=1; i<=2; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}	
	}
}
