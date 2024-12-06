package Array;

public class ex1_StringArray 
{
	public static void main(String[] args) 
	{
		//step1: Array declaration
		String [] ar=new String[5];    //0 to 4
		
		//Step2: Array Initialization
		ar[0]="rahul";
		ar[1]="ganesh";
		ar[2]="mahesh";
		ar[3]="ramesh";
		ar[4]="suresh";
				
		System.out.println(ar[0]);   //rahul
		System.out.println(ar.length);   //5
		
		System.out.println("-----print all data------");
		
		//           5<=4    
//		for(int i=0; i<=4; i++) 
//		{  //                  ar[4]
//			System.out.println(ar[i]);      //rahul ganesh mahesh ramesh suresh
//		}
		
		
		for(int i=0; i<=ar.length-1; i++) 
		{  
			System.out.println(ar[i]);     
		}		
	}
}
