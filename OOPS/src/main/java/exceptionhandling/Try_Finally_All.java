package exceptionhandling;

public class Try_Finally_All {

	public static void main(String[] args) {
		try {
			int a=10/0;//arithmetic excep
			
		}
catch(ArithmeticException e) //Exception is the class
		{
	System.out.println("exception handelled");
	System.out.println(e);
}
		catch(ArrayException e) //Exception is the class
		{
	System.out.println("exception handelled");
	System.out.println(e);
}
	}

}
