package abstraction;

public class Car extends Vechicle {
public void millage() {
	System.out.println("car millage");
}
	public static void main(String[] args) {
		Vechicle obj=new Car();//will invoke constructor also of vechicle.child class obj is created
		obj.millage();
		obj.speed();

	}

}
