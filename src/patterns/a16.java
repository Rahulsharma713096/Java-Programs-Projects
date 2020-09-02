package patterns;
import java.util.Scanner;
public class a16 {

	public static void main(String[] args) {

Scanner Scan=new Scanner(System.in);
System.out.println("Enter the number");
 	int n=Scan.nextInt();
 	for(int i=n;i>=1;i--)
 	{
 		for(int j=1;j<=n;j++)
 		{
 			System.out.print(i);
 		}
 		System.out.println();
 	}
	}

}
