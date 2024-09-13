package interfacepackage;

public class Car implements Vechicle  {
public void show() {//abstract method implementation
	System.out.println("speed");
}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.show();

	}

}
