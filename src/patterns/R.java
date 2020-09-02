package patterns;
import java.util.Scanner;
public class R {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter number of stars:");
		int n=Scan.nextInt();
	 for(int i=0;i<=n-1;i++)
	 {
		 for(int j=0;j<=n-1;j++)
		 {
			 if(j==0||i==0||(j==n-1&&i<=n/3)||(i==n/3))
				 System.out.print("*");
			 else System.out.print(" ");
			 if(j>=n/3&&j>=n/3&&i==j)
			 {
				 System.out.print("*");
			 }
		 }
		 System.out.println();
	 }
	}

}
