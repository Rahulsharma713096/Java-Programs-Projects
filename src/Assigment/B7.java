package Assigment;
import java.util.Scanner;
public class B7 {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the Statment:");
	String s=d.nextLine();
	s=s.trim();
	char n[]=new char[s.length()];
	for(int i=0;i<=s.length()-1;i++)
	{
		n[i]=s.charAt(i);
	}
	for(int i=s.length()-1;i>=s.length()/2;i--)
	{
	 System.out.print(n[i]+ " ");
	}
	d.close();
}
}
