package Numbers;
import java.util.Scanner;
public class n4 {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number:");
int n=Scan.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(j==n||(j==1&&i<=n/2)||i==n/2)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
