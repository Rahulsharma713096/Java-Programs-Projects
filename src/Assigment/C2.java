package Assigment;
import java.util.Scanner;
public class C2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the words:");
	String s=sc.nextLine();
	char t[]=s.toCharArray();
	int i=0;
	while(i<=t.length-1) {
		if(i%2==0) System.out.print(t[i]); 
		i++;
	} 
	for(int i1=0;i1<=t.length-1;i1++) {
		if(i1%2==1) System.out.print(t[i1]);
		
	}
	sc.close();
}
}
