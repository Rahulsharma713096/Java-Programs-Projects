package Assigments;
import java.util.Scanner;
public class A19 {
public static void main(String[] args) { String res="";
	Scanner sc=new Scanner(System.in);
	// Take input Sentence
	System.out.println("Enter The Sentence:");
	String s=sc.nextLine();
	//take secial character as input
	System.out.println("Enter the special character:");
	String sp=sc.nextLine();
	//search vowel and add it spcial characer before it
	s=s.trim();
	for(int i=0;i<=s.length()-1;i++)
	{
	char c=s.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
		res+=sp;
		res+=c;
	}
	else res=res+c;
	}
	for(int x=0;x<=res.length()-1;x++)
	{
		char res1=res.charAt(x);
		System.out.print(res1);
	}
	sc.close();
}
}
