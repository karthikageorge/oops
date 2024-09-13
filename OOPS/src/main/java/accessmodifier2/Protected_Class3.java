package accessmodifier2;

import accessmodifier.Protected_Class1;
//access with help of child class
public class Protected_Class3 extends Protected_Class1 {

	public static void main(String[] args) {
		Protected_Class3 obj=new Protected_Class3();//created the child class obj and access the parent class properties
		obj.show();
		System.out.println(obj.a);

	}

}
