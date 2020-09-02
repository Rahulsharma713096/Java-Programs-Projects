package Strings;
import java.util.Scanner;
public class S17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s=scan.nextLine();
		String rev="";
		s=s.trim();
	   
		for(int i=s.length()-1;i>=0;i--)
		{
				rev+=s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		System.out.println("Pallindrome");
		else
		System.out.println("Not Pallindrome");
		scan.close();
	}

}
