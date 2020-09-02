package Assigment;
import java.util.Scanner;
public class B8 {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the Statment:");
	String s=d.nextLine();
	s=s.trim(); int mid=0; 
	if(s.length()%2==0) mid=s.length()/2;
	else mid=(s.length()-1)/2;
	char x[]=new char[mid];
	for(int i=mid-1;i>=0;i--)
	{
		x[i]=s.charAt(i);
	}
	//print output
	for(int i=mid-1;i>=0;i--)
		System.out.print(x[i]);
	for(int k=mid;k<=s.length()-1;k++) System.out.print(s.charAt(k));
	d.close();
}
}

