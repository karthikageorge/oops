package encapulation;

public class Encapsulation1 {
	private String Name;
    private int Age;
    private int s=9;
	public String getName() { //method and var are binded into a single unit(getname)
		return Name;
	}
	public void setName(String name) {//para method
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getS() {
		return s;
	}
}
