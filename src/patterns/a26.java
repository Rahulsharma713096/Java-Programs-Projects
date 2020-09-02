package patterns;
import java.util.Scanner;
public class a26 {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=Scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	
}
