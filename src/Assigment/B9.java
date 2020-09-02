package Assigment;
import java.util.Scanner;
public class B9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the statments:");
	String s=sc.nextLine();
	for(int i=s.length()/2;i<=s.length()-1;i++)
	{
		System.out.print(s.charAt(i));
	}
	for(int i=(s.length()/2)-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	sc.close();
}
}
