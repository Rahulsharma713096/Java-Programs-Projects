package Assigment;
import java.util.Scanner;
public class Sa8 {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the Statment:");
	String s=d.nextLine();
	s=s.trim(); int l=(s.length()-1)/2;
	char n[]=new char[s.length()];
	
	for(int i=0;i<=(s.length()/2)-1;i++)
	{
		n[i]=s.charAt(l);  l--;
	} 
	
	//print output
	for(int k=0;k<s.length()/2;k++) System.out.print(n[k]);
	for(int i=s.length()/2;i<=s.length()-1;i++)
	{
		System.out.print(s.charAt(i));
	}
	d.close();
}
}