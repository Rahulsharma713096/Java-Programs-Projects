package patterns;
import java.util.Scanner;
public class Q {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number:");
int n=Scan.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(j==1||j==n||(i==1&&j>=2&&j<=n-1)||i==n||(i==j&&j>=n-3)  )
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
