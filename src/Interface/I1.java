package Interface;
import java.util.Scanner;
interface Calculator{
	void mul();
	void div();
}
class Calculator1 implements Calculator
{ int a=10,b=15,c;
public Calculator1() {
	System.out.println("Calculator 1");
}
	public void mul()
	{
		c=a*b;
System.out.println(c);		
	}
	public void div() {
if(b==0) System.out.println("Invalid b value"+b);
else {
	c=a/b;
	System.out.println(c);
}
	}
}
class Calculator2 implements Calculator
{ int a,b,c;
public Calculator2() {
	System.out.println("Calculator 2");
}
Scanner sc=new Scanner(System.in);
	public void mul()
	{ System.out.println("Enter the First Number:");
	a=sc.nextInt();
	System.out.println("Enter the Second Number:");
	b=sc.nextInt();
		c=a*b;
System.out.println(c);		
	}
	public void div() {
		System.out.println("Enter the First Number:");
		a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		b=sc.nextInt();
if(b==0) System.out.println("Invalid b value"+b);
else {
	c=a/b;
	System.out.println(c);
}
	}
}
class Calculator3 implements Calculator
{ int a,b,c;
public Calculator3() {
	System.out.println("Calculator 3");
}
Scanner sc=new Scanner(System.in);
	public void mul()
	{ System.out.println("Enter the First Number:");
	a=sc.nextInt();
	System.out.println("Enter the Second Number:");
	b=sc.nextInt();
		c=a*b;
System.out.println(c);		
	}
	public void div() {
		System.out.println("Enter the First Number:");
		a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		b=sc.nextInt();
if(b==0) System.out.println("Invalid b value"+b);
else {
	c=a/b;
	System.out.println(c);
}
	}
}
class math{
	void permit(Calculator ref) {
		ref.mul();
		ref.div();
	}
}
abstract public class  I1 {
	public static void main(String[] args) {
		Calculator1	c1=new Calculator1();
		Calculator2	c2=new Calculator2();
		Calculator3	c3=new Calculator3();
		math m=new math();
		m.permit(c1);
		m.permit(c2);
		m.permit(c3);
	}
}
