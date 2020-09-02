package Assigment;
import java.util.Scanner;
public class B2 {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the statment:");
	String s=d.nextLine();
	for(int i=0;i<=(s.length()/2)-1;i++)
	{
		System.out.print(s.charAt(i));
	}
	d.close();
}
}
