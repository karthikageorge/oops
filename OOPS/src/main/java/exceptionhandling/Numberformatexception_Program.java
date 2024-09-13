package exceptionhandling;

public class Numberformatexception_Program {

	public static void main(String[] args) {
		try {
			String str="hello";
			int num=Integer.parseInt(str);//string---int convert(number format exception)
			
		}
catch(NumberFormatException e) {
	System.out.println(e);
}
	}

}
