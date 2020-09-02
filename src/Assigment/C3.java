package Assigment;
import java.util.Scanner;
public class C3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the words:");
	String s=sc.nextLine();
	char t[]=s.toCharArray();
	for(int i=0;i<=t.length-1;i++) {
	if(i%2==0)	System.out.print(t[i]+" ");
	else  {	int a=t[i];
		System.out.print(a+" "); }
	}
	sc.close();
}
}
