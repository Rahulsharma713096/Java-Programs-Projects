package Assigment;
import java.util.Scanner;
public class B3
{
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the statment:");
	String s=d.nextLine(); int n=(s.length()/2);
	for(int i=0;i<=(s.length()/2);i++,n++)
	{
		System.out.print(s.charAt(n-1));
	}
	d.close();
}
}
