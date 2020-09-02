package Assigment;
import java.util.Scanner;
public class C1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the words:");
	String s=sc.nextLine();
	char t[]=s.toCharArray();
	int i=0,j=t.length-1,k=0;
	while(i<=t.length-1) {
		if(i%2==0) {System.out.print(t[k]); k++; }
		else {System.out.print(t[j]); j--;     }
		i++;
	}
	sc.close();
}
}
