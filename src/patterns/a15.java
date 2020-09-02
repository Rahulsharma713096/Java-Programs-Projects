package patterns;
import java.util.Scanner;
public class a15 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=Scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
