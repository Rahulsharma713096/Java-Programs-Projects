package patterns;
import java.util.Scanner;
public class a21 {

	public static void main(String[] args) {
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number:");
int n=Scan.nextInt();
int x;
		for(int i=1;i<=n;i++)
		{
			x=n*i;
			for(int j=1;j<=n;j++)
			{
			if(j<n)
				System.out.print(x-- +"*");
			else System.out.print(x--);
			}
			System.out.println();
		}
	}

}
