package aggregation;

public class Student {
String name;
Details details;

Student(String name,Details a){
	this.name=name;
	this.details=a;
}
public void display() {
	System.out.println(name);
	System.out.println(details.schoolname+" "+details.id);
}
	public static void main(String[] args) {
	Details obj1=new Details("PVV",1);
	Student obj=new Student("karthika",obj1);
	
	obj.display();
	}

}
