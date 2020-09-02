package Strings;
import java.util.Scanner;
public class S14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the words in between words keep only one space:");
		String s=scan.nextLine();
		int count=0;
		s=s.trim();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("The Number of words"+count+1);
		scan.close();
	}

}
