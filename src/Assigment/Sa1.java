package Assigment;
import java.util.Scanner;
public class Sa1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Statment:");
	String s=sc.nextLine(); s=s.trim();
	int n=s.length();
	String[]  c=new String[n]; 
	String res=""; int k=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		char x=s.charAt(i); res+=x;
		if(x==' ')
		{
		c[k++]=res; 
		res="";
		} if(s.length()==i) break;
	}
	c[n-1]=res;
	for(int k1=0;k1<=s.length()-1;k1++) {
	System.out.print("String Aray Position:"+k1+" :value:");
		System.out.println(c[k1]);
		}

	sc.close();
}
}
