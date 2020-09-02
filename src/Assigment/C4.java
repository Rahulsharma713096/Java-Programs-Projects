package Assigment;
import java.util.Scanner;
public class C4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the words:");
	String s=sc.nextLine();
	char t[]=s.toCharArray(); String res="";
	for(int i=0;i<=t.length-1;i++)
	{
		char x=t[i];
		if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
		res+="#"; res+=(char)(x-32); 	}
		else res+=x;
		}
	System.out.println(res);
	sc.close();
}
}
