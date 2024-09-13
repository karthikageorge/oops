package polymorphism;

public class Overriding2 extends Overriding1 {
public void display()
{
	System.out.println("world");
}
	public static void main(String[] args) {
	Overriding2 obj =new Overriding2();
	obj.display();
	//Overriding1 obj2 =new Overriding1();
	//obj2.display(); to override we use super keyword ,to get parent class properties

	}

}
