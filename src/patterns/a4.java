package patterns;
import java.util.Scanner;
public class a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number");
int n=Scan.nextInt();
for(int i=1;i<=n;i++)
{
	for(int k=1;k<=(n-i+1);k++)
	{

	System.out.print("-");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
 System.out.println();}
	}

}
