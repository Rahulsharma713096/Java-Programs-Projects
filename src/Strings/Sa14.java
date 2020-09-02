package Strings;
import java.util.Scanner;
public class Sa14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the words :");
		String s=scan.nextLine();
	
		s=s.trim();
		String[] x=s.split(" ");
		System.out.println("The Number of words"+x.length);
		scan.close();
	}

}
