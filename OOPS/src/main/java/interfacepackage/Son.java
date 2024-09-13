package interfacepackage;

public class Son extends Father {
public void display() {
	System.out.println("son age");
}
	public static void main(String[] args) {
		//Son obj=new Son();
		Father obj1=new Son();
		Grandparenet obj=new Son();
		
		//obj.display();
		obj1.display();

	}

}
