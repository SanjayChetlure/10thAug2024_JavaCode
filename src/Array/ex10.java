package Array;

public class ex10 
{
	public static void main(String[] args) 
	{
			//  0  1  2
			//0 10 20 30
			//1 40 50 60
			//2 70 80 90
		
		int [][] ar= {{10,20,30},{40,50,60}, {70,80,90}};
				
		System.out.println(ar[1][1]);
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
