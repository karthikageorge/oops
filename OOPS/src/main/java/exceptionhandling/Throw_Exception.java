package exceptionhandling;

public class Throw_Exception {
int a=10;
static String str="karthika";
public static void display(int age) {
	if(age<18) {
		throw new ArithmeticException("person is not elligible to vote");
		
	}
	else {
		System.out.println("person is elligible");
	}
}
	public static void main(String[] args) {
		Throw_Exception.display(13);

	}

}
