package demo;
import java.util.Scanner;
public class FabonaciiSeries {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number FabonaciiSeries:");
	int n=Scan.nextInt();
	int n1=0, n2=1,f=n1+n2;
	System.out.println("1");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i+1;j++)
		{ f=n1+n2;
		 n1=n2;
		 n2=f;
					
			System.out.print(f +" ");
		}
		System.out.println();
	}
	Scan.close();
}
}
