package Assigment;
import java.util.Scanner;
public class A1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Statment:");
	String s=sc.nextLine();        s=s.trim();  int n1=0; 
	//check number of Words present in String
	for(int k=0;k<=s.length()-1;k++) {
	char x=s.charAt(k);
	if(x==' '||x=='\t') n1++;
	} n1=n1+1;
	//Declare String Array
	String[]  c=new String[n1]; 
	String res=""; int k=0;
	//Convert String to String Array
	for(int i=0;i<=s.length()-1;i++)
	{
		char x=s.charAt(i); res+=x;
		if(x==' ')
		{
		c[k++]=res; 
		res="";
		} if(s.length()==i) break;
	}
	c[n1-1]=res;
	for(int k1=0;k1<=n1-1;k1++) {
		System.out.print("String array position:"+k1+",at value:");	
		System.out.println(c[k1]);
	}

	sc.close();
}
}
