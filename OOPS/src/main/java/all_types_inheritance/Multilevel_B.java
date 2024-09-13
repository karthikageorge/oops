package all_types_inheritance;

public class Multilevel_B extends Multilevel_A {
public void displayB(){
	float a=9.9f,b=7.2f;
	float sub=a-b;
	System.out.println("Substraction of float numbers ="+sub);
}
	public void displayB(int a1,int b1) {
		int mul=a1*b1;
		System.out.println("Multiplication="+mul);
	}
	

}
