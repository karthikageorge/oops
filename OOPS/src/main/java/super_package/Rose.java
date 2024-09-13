package super_package;

public class Rose extends Flower {
Rose(){
	//super();//  invoke parent class constructor,compiler will automatically add the parent class properties if it is default constructor
	System.out.println("world");
	
}
	public static void main(String[] args) {
		
Rose obj=new Rose();
	}

}
