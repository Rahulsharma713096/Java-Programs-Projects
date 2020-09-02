package patterns;
import java.util.Scanner;
public class a18a {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=Scan.nextInt();
	int x=n*n;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{  if(x<=9)
			System.out.print("0"+x--);
		else System.out.print(x--);
		}
		System.out.println();
	}

	}

}
