package patterns;
import java.util.Scanner;
public class M {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number odd and grater than 10:");
int n=Scan.nextInt();
for(int i=0;i<=n-1;i++)
{
	for(int j=0;j<=n-1;j++)
	{
		if(j==0||j==n-1||(i==j&&i<=n/2)||(i+j==n-1&&i<=n/2)
				)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
