package Arrays;
import java.util.Scanner;
public class ba {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int a[][][]=new int[2][3][4];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("Enter the School  :  "+i+" ,class  :  "+j+" ,student  :  "+k);
					a[i][j][k]=Scan.nextInt();
				}
				
			}
		}

		System.out.println("The marks are:");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println(a[i][j][k]);
				}
				
			}
		}

		Scan.close();
	}

}
