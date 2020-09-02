package Strings;
import java.util.Scanner;
public class S18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s=scan.nextLine();
		String rev="";
		s=s.trim();
	   if(s.length()!=6)
		   System.out.println("not callindrome");
	   else {
		for(int i=s.length()-1;i>=0;i--)
		{
				rev+=s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)&&s.length()==6)
		System.out.println("callindrome");
		else
		System.out.println("not callindrome");
		scan.close();
	}
	}
}
