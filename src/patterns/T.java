package patterns;
import java.util.Scanner;
public class T {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number:");
int n=Scan.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(i==1||j==n/2)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
