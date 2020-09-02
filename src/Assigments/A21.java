package Assigments;
import java.util.Scanner;
public class A21 {
public static void main(String[] args) { String res=""; String res1="";
	Scanner sc=new Scanner(System.in);
	// Take input Sentence
	System.out.println("Enter The Sentence:");
	String s=sc.nextLine();
	
	//Tracing the Strings
	s=s.trim(); //USE To remove space from starting and ending Sentence in the String
	for(int i=0;i<=s.length()-1;i++)
	{
	char c=s.charAt(i);
	if((c>='A' && c<='Z') || (c>='a'&&c<='z')||c==' ') res+=c;
	else if(c>='0'&&c<='9') { }
	else res1+=c;
	}
	//Pint Final Output
	for(int x=0;x<=res.length()-1;x++)
	{
		char res2=res.charAt(x);
		System.out.print(res2);
	} 
	for(int x=0;x<=res1.length()-1;x++)
	{
		char res2=res1.charAt(x);
		System.out.print(res2);
	}
	sc.close();
}
}
