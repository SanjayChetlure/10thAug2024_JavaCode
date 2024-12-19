package StarPattern;

public class NumPattern4
{
	public static void main(String[] args)
	{
		//1
		//22
		//333
		
		int col=1;
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=col; j++)
			{
				System.out.print(i);
			}
			System.out.println();
			col++;
		}
		
		
	}

}
