package Strings;
import java.util.Scanner;
public class S16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s=scan.nextLine();
		s=s.trim();
		s=s.toLowerCase();
	      int v=0,c=0;	
		for(int i=0;i<=s.length()-1;i++)
		{ char ch=s.charAt(i);
			 if(ch>='a'&& ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					v++;
			
			else {
				c++;
			}
				}
		}
		System.out.println("The vowels are:"+v);
		System.out.println("The consonant are:"+c);
		scan.close();
	}

}
