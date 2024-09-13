package finalpackage;

public class Finaloverriding extends Finaloverriding1 {
	public void display() {//cannot override with final keyword
		System.out.println("world");
		
	}

	public static void main(String[] args) {
		Finaloverriding obj =new Finaloverriding();
		obj.display();

	}

}
