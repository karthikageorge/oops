package abstraction;

public class Jasmine extends Flower {
	public void smell() {
		System.out.println("smell of jasmine");
	}

	public static void main(String[] args) {
		//Flower obj=new Jasmine();//to get smell of jasmine only
		Flower obj=new Rose();//to get smell of rose only
		obj.smell();

	}

}
