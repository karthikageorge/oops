package exceptionhandling;

public class Arithmeticexception_Handling {

	public static void main(String[] args) {
		try {
			int a=10/0;//arithmetic excep
			
		}
catch(Exception e) //Exception is the class
		{
	System.out.println("exception handelled");
	System.out.println(e);
}
	}

}
