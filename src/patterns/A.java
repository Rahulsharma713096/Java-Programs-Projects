package patterns;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number:");
int n=Scan.nextInt();
for(int i=0;i<=n-1;i++)
{
	for(int j=0;j<=n-1;j++)
	{
		if((i==0&&j<=n/2-1&&j!=0)||(i==n/2&&j<n/2||j==0||(j==n/2&&j!=0&&i!=0)))
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
