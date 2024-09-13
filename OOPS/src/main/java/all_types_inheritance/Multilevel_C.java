package all_types_inheritance;

public class Multilevel_C extends Multilevel_B{
	public void displayC()
	{
		int a=4,b=2;
		int div=a/b;
		System.out.println("Division="+div);
	}
	public static void main(String[] args) {
	Multilevel_C obj=new Multilevel_C();
	obj.displayA();
	obj.displayB();
	obj.displayB(5,6);
	obj.displayC();
	
	}

}
