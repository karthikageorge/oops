package review;

public class Aggregation2 {
String str;
Aggregation1 aggr;
Aggregation2(String str,Aggregation1 aggr){
	this.str=str;
	this.aggr=aggr;
			}
public void display() {
	System.out.println(aggr.city+" "+aggr.country);
	System.out.println(str);
}
	public static void main(String[] args) {
		Aggregation1 a =new Aggregation1("india","changanacherry");
		Aggregation2 obj=new Aggregation2("hi",a);
		obj.display();

	}

}
