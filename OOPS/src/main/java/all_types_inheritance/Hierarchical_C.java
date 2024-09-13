package all_types_inheritance;

public class Hierarchical_C extends Hierarchical_A {
	public void displayC(int a,int b) {
		int div =a/b;
		System.out.println("Division= "+div);
	}
	public int display(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}

	public static void main(String[] args) {
		
		Hierarchical_C obj=new Hierarchical_C();
		obj.display();
		System.out.println("Sum= "+obj.display(1, 2, 3));
		
		obj.displayC(4, 2);
		Hierarchical_B obj1=new Hierarchical_B();
		obj1.displayB();
		
	}

}
