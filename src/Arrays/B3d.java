package Arrays;
import java.util.Scanner;
public class B3d {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int a[][][]=new int[2][][];
		
	       a[0]=new int[3][];
		   a[1]=new int[2][];
		   a[0][0]=new int[3];
		   a[0][1]=new int[1];
		   a[0][2]=new int[2];
		   a[1][0]=new int[2];
		   a[1][1]=new int[1];
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
