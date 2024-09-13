package inheritance;
//babydog is the child class, which we will create the obj to access parent class 
public class Babydog extends Dog {
	public void sleep()
	{
		System.out.println("sleeping");
	}

	public static void main(String[] args) {
		Babydog obj= new Babydog();
		obj.sleep();
		obj.run();

	}

}
