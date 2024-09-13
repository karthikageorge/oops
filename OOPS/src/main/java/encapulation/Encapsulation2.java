package encapulation;

public class Encapsulation2 {

	public static void main(String[] args) {
	
		Encapsulation1 obj=new Encapsulation1();
		obj.setName("karthika");//setvalue
		obj.setAge(30);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());//view
		System.out.println(obj.getS());
	}

}
