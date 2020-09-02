package Exceptions;
import java.util.Scanner;
class Demo1
{
	public void alpha()
	{
		System.out.println("Connection 4 is established");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numerator");		
		int a=scan.nextInt();
		System.out.println("Enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("Connection 4 is terminated");
scan.close();	
	}
	
}

class Demo2
{
	public void beta()
	{
		System.out.println("Connection 3 is established");
		Demo1 d1=new Demo1();
		d1.alpha();
		System.out.println("Connection 3 is terminated");
	}
}
class Demo3
{
	public void gamma()
	{
		System.out.println("Connection 2 is established");
		Demo2 d2=new Demo2();
		d2.beta();
		System.out.println("Connection 2 is terminated");
	}
}

public class E1
{
	public static void main(String[] args)
	{
		System.out.println("Connection 1 is established");
		Demo3 d3=new Demo3();
		d3.gamma();
		System.out.println("Connection 1 is terminated");	
	}
}
