package all_types_inheritance;

public class Single_Inheritance_Child extends Single_Inheritance_Parent {
public void showsub() {
	int a=9,b=8;
	int sum=a-b;
	System.out.println("Substration= "+sum);
}
	public static void main(String[] args) {
		Single_Inheritance_Child obj=new Single_Inheritance_Child();
		obj.show();
		obj.showsub();

	}

}
