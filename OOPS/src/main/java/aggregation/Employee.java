package aggregation;

public class Employee {
	//instance variables
	int id;
	String name;
	Adress adress;//reference object of class Adress as instance variable
	
	//local variables as para
	Employee(int id,String name,Adress adress){//3
		this.id=id;
		this.name=name;
		this.adress=adress;
		
	}
	//default instance method
public void display() {
	System.out.println(id+" "+name);
	System.out.println(adress.city+" "+adress.state+" "+adress.country);
}
	public static void main(String[] args) {
		Adress adress1 =new Adress("changanacherry","kerala","india");//1
		Employee obj=new Employee(22,"karthika",adress1);//2
		
		obj.display();
	}
}


