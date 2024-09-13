package super_package;

public class Cat extends Animal {
String name="karthika"; //instance variable same as parent class var
public void show() {
	System.out.println(name);
	System.out.println(super.name);//(multiple class)immediate parent class instance var
}
public static void main(String args[]) {
	Cat obj=new Cat();
	obj.show();
}
}
