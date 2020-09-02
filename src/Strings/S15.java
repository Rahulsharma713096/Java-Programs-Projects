package Strings;
import java.util.Scanner;
public class S15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s=scan.nextLine();
		String res="";
		s=s.trim();
		for(int i=0;i<=s.length()-1;i++)
		{ char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				res+=(char)(ch+32);
			}
			else if(ch>='a'&& ch<='z')
			{
				res+=(char)(ch-32);
			}
			else {
				res+=ch;
			}
		}
		System.out.println("The Case Swap is "+res);
		scan.close();
	}

}
