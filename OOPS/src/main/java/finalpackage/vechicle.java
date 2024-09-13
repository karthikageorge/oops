package finalpackage;

public class vechicle {
	final int speed=90;//cannot modify
public void speed() {
	//speed =60;
	System.out.println(speed);
}
	public static void main(String[] args) {
		vechicle obj=new vechicle();
		obj.speed();
	}

}
