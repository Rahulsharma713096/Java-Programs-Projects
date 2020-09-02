package Assigments;
import java.util.Scanner;
public class A16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//take the string and store
		System.out.println("Enter the Sentence :");
		String a=sc.nextLine();
		a=a.trim();
		String  res[]=a.split("  ");
		System.out.println("The output is:");
		for(int i=0;i<=res.length-1;i++)
		System.out.print(res[i]);
		sc.close();
	}

}
