package Strings;
import java.util.Scanner;
public class S12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the words");
		String s=scan.next();
		//convert String into char[]
		char[] c=s.toCharArray();
		String even="";
		String odd=" ";
		for(int i=0;i<=c.length-1;i++)
		{
			if(i%2==0)
				even+=c[i];
			else
				odd+=c[i];
		}
		System.out.println(even+odd);
		scan.close();
	}

}
