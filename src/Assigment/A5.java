package Assigment;
import java.util.Scanner;
public class A5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//Taking input Statments
	System.out.println("Enter the Statments :");
	String s=sc.nextLine();
	//Taking as input another string which has to insert
	System.out.println("Enter the Another String:");
	String s1=sc.nextLine();
	//Takin position where character to be insert
	System.out.println("Enter the Position Where String Has to Insert:");
	int n=sc.nextInt();
	String re="";
	s=s.trim();
	s1=s1.trim();
	//insetion of String at n position
	for(int i=0;i<=s.length()-1;i++)
	{
		char c=s.charAt(i);
		if(i==n) { for(int k=0;k<=s1.length()-1;k++) { char c1=s1.charAt(k); re+=c1;           }
				re+=c;	}
		else re+=c;
	}
	//final output
	System.out.println("The Final output is:");
	for(int j=0;j<=re.length()-1;j++)
	{ char x=re.charAt(j);
		System.out.print(x);
	}
	sc.close();
}
}
