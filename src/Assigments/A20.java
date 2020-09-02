package Assigments;
import java.util.Scanner;
public class A20 {
public static void main(String[] args) { String res="";
	Scanner sc=new Scanner(System.in);
	// Take input Sentence
	System.out.println("Enter The Sentence:");
	String s=sc.nextLine();
	
	//Removing Number And Special Character From Sentence
	s=s.trim(); //use to remove space from starting and ending Sentence
	for(int i=0;i<=s.length()-1;i++)
	{
	char c=s.charAt(i);
	if((c>='A' && c<='Z') || (c>='a'&&c<='z')||c==' ') res+=c;
	}
	//Pint Final Output
	for(int x=0;x<=res.length()-1;x++)
	{
		char res1=res.charAt(x);
		System.out.print(res1);
	}
	sc.close();
}
}
