package multipleinheritance;

public class Child implements Parent1,Parent2 {
	/*public void show() {
		System.out.println("parent1 method");
	}
public void display() {
	System.out.println("parent2 method");
}*/
public void speed(){//same method implements only once
	System.out.println("same method");
}

	public static void main(String[] args) {
		Child obj=new Child();
		//obj.show();
		//obj.display();
		obj.speed();
		
	}

}
