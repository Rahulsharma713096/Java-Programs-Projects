package Static;
import java.util.Scanner;
public class S1 {
public static void main(String[] args) {
	Farmer f1=new Farmer();
	Farmer f2=new Farmer();
	Farmer f3=new Farmer();
f1.input(); f2.input(); f3.input();
f1.compute(); f2.compute(); f3.compute();
f1.display(); f2.display(); f3.display();
}
}

class Farmer
{ Scanner scan=new Scanner(System.in);
	float p; float r; float t; float si;
	void input()
	{
	
	System.out.println("Enter the Principle Amount:");
	p=scan.nextFloat();
	System.out.println("Enter the Time:");
	t=scan.nextFloat();
	r=2.0f;
	
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