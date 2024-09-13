package exceptionhandling;

public class Nullpointerexceptional_Program {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
