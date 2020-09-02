package Constructor;
class Dog {
	String n;
	String c;
	int cost;
	Dog() {
		this("XOZZO");
		n="Jimmy";
		c="Black";
		cost=5000;
	}
	Dog(String n,String c,int cost)
	{
		this();
		this.n=n;
		this.c=c;
		this.cost=cost;
	}
	String getName()
	{
		return n;
	}
	String getColor()
	{
		return c;
	}
	int getCost()
	{
		return cost;
	}
	Dog(String n)
	{
		this.n=n;
	}
}
public class C1 {
public static void main(String[] args) {
	Dog d1=new Dog();
	System.out.println(d1.n);
	System.out.println(d1.c);
	System.out.println(d1.cost);
	Dog d2=new Dog("Tommy","Pink",20);
	System.out.println(d2.n);
	System.out.println(d2.c);
	System.out.println(d2.cost);
}
}
