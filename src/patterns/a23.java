package patterns;
import java.util.Scanner;
public class a23 {

	public static void main(String[] args) {
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number:");
int n=Scan.nextInt();
		for(int i=1;i<=n;i++)
		{
		
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}
