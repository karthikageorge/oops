package interfacepackage;

public class Jasmine implements Flower {
	public void smell() {
		System.out.println("pretty");
	}
	public static void main(String[] args) {
		//Flower obj= new Rose();
		Flower obj= new Jasmine();
		obj.smell();
	}

}
