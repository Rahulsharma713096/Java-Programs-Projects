package patterns;
import java.util.Scanner;
public class a23a {

	public static void main(String[] args) {
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number:");
int n=Scan.nextInt();
		for(int i=1;i<=n;i++)
		{
		
			for(int j=1;j<=n;j++)
			{
		
					System.out.print(i%2);
			}
			System.out.println();
		}
	}

}
