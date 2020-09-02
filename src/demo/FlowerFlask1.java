package demo;
import java.util.Scanner;
public class FlowerFlask1 {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the Imput it grater than 15: ");
	int n=Scan.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==n||(j==4&&i<=n/2)||(j==n-4&&i<=n/2)||(i>=n/2&&i+j==n)||(i>=n/2&&i==j))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	} Scan.close();
}
}
