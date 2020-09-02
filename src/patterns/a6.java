package patterns;
import java.util.Scanner;
public class a6 {
	public static void main(String args[])
	{
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter th Number");
	int n=Scan.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<(n-i+1)+1;j++)
		{
			System.out.print("-");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	for(int i=2;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("-");
		}
		for(int k=2;k<=(n-i+1)+1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
}
