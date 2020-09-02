package Static;
import java.util.Scanner;
public class S2 {
public static void main(String[] args) {
	Farmer1 f1=new Farmer1();
	Farmer1 f2=new Farmer1();
	Farmer1 f3=new Farmer1();
f1.input(); f2.input(); f3.input();
f1.compute(); f2.compute(); f3.compute();
f1.display(); f2.display(); f3.display();
}
}

class Farmer1
{ Scanner scan=new Scanner(System.in);
	float p;static   float r; float t; float si;
	static {    r=2.0f;        }
	void input()
	{
	
	System.out.println("Enter the Principle Amount:");
	p=scan.nextFloat();
	System.out.println("Enter the Time:");
	t=scan.nextFloat();
	
	}
	void compute()
	{
		si=(p*r*t)/100;
	}
	void display()
	{
		System.out.println(si);
	} 
}