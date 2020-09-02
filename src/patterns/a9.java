package patterns;
import java.util.Scanner;
public class a9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number");
int n=Scan.nextInt();
for(int i=1;i<=n;i++)
{
	for(int k=1;k<=n-i+1;k++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++)
	{
		if(j==1 || j==2*i-1 ||i==n)
		System.out.print("*");
		else System.out.print(" ");
	}
	System.out.println();
}
for(int i=2;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for( int k=1;k<=2*(n-i+1)-1;k++)
	{
		if(k==1||k==2*(n-i+1)-1)
	System.out.print("*");	
		else System.out.print(" ");
	}
	System.out.println();
}
	}

}
