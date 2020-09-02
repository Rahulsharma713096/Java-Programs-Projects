package patterns;
import java.util.Scanner;
public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number");
int n=Scan.nextInt();
for(int i=0;i<=n-1;i++)
{
	for(int j=0;j<=n-1;j++)
	{
		if(i==0||j==0||i==n-1||j==n-1)
		System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
