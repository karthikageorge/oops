package polymorphism;

public class Method_Overloading {
	public void display() {
		System.out.println("hello");
	}
	public void display(int a,int b)
	{
		System.out.println("numbers"+a+ "and" +b);
	}
	public static void main(String[] args) {
		Method_Overloading obj =new Method_Overloading();
		obj.display();
		obj.display(1, 2);
	}

}
