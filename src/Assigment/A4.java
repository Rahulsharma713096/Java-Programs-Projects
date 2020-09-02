package Assigment;
import java.util.Scanner;
public class A4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//Taking input Statment 
	System.out.println("Enter the Statments :");
	String s=sc.nextLine();
	//change Statement Upper case to Lower case
	for(int i=0;i<=s.length()-1;i++)
	{
		char c=s.charAt(i);
		if(c>='A'&&c<='Z') { 
			System.out.print(Character.toLowerCase(c)); }
		else if(c>='a'&&c<='z') { 
			System.out.print(Character.toUpperCase(c)); }
		else System.out.print(c);
	}
	sc.close();
}
}
