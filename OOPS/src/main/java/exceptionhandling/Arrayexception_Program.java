package exceptionhandling;

public class Arrayexception_Program {

	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[8]=9;

		}
		catch(Exception e) {
			System.out.println("exception handled");
			System.out.println(e);
		}
		
	}

}
