package Interface_ImplementationClass;

public interface CommonFunctions 
{
	
	public static void getExceldata()
	{
		getExcelPath();
		System.out.println("running getExceldata method");
	}
	
	
	private static void getExcelPath()
	{
		System.out.println("running getExcelPath method");
	}
	
	
	public static void storeDataInExcel()
	{
		getExcelPath();
		System.out.println("running getExceldata method");
	}
	

}
