package demo;
import java.util.Scanner;
public class NCN {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=Scan.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
						System.out.print(count++ +" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		Scan.close();
	}

}
