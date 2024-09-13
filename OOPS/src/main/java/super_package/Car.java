package super_package;

public class Car extends Vechicle {
	public void speed() {
		
		System.out.println("ooadi");
		super.speed();// immediate parent class instance method invoke
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.speed();

	}

}
