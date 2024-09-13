package abstraction;
//abstract class implementation on 2nd class
public class Dog extends Animal {
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.run();
		obj.sleep();

	}

}
