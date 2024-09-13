package hierarchical;

public class Class_C extends Class_A {
public void cdisplay() {
	System.out.println("class C");
}
	public static void main(String[] args) {
		Class_C obj=new Class_C();
		obj.cdisplay();
		obj.adisplay();
		
		Class_B obj1=new Class_B();
		obj1.bdisplay();
		obj1.adisplay();

	}

}
