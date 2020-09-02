package patterns;
import java.util.Scanner;
public class a1 {
	public static void main(String args[])
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=Scan.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("*");
		}
	}

}
