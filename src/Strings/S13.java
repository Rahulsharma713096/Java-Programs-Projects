package Strings;
import java.util.Scanner;
public class S13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the words");
		String s=scan.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("The Number of Spaces"+count);
		scan.close();
	}

}
