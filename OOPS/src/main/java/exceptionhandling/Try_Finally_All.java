package exceptionhandling;

public class Try_Finally_All {

	public static void main(String[] args) {
		try {
			//int a=10/0;//arithmetic excep
			int arr[]=new int[5];
			arr[7]=9;
		}
catch(ArithmeticException e) //Exception is the class
		{
	System.out.println("exception handelled");
	System.out.println(e);
}
		catch(ArrayIndexOutOfBoundsException e) //Exception is the class
		{
	System.out.println("exception handelled");
	System.out.println(e);
		}
	catch(NumberFormatException e) //Exception is the class
	{
System.out.println("exception handelled");
System.out.println(e);
}
		catch(NullPointerException e) //Exception is the class
		{
	System.out.println("exception handelled");
	System.out.println(e);
	}
		finally {
			System.out.println("all exceptions");
		}
	
	}
}
