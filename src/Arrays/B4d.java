package Arrays;
import java.util.Scanner;
public class B4d {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int a[][][][]=new int[2][][][];
		a[0]=new int[2][][];
		a[1]=new int[1][][];
		a[0][0]=new int[3][];
		a[0][1]=new int[2][];
		a[1][0]=new int[1][];
		a[0][0][0]=new int[3];
		a[0][0][1]=new int[1];
		a[0][0][2]=new int[2];
		a[0][1][0]=new int[2];
		a[0][1][1]=new int[1];
		a[1][0][0]=new int[2];
		//insert the values
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					for(int l=0;l<=a[i][j][k].length-1;l++)
					{
						System.out.println("Enter the city  :  "+i+" ,school  :  "+j+" ,class  :  "+k+",students:"+l);
						a[i][j][k][l]=Scan.nextInt();
				}
				
			}
		}
		}
		Scan.close();
		//showing output of 4d array
		System.out.println("The marks are:");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					for(int l=0;l<=a[i][j][k].length-1;l++)
					{
						System.out.println(a[i][j][k][l]);
					}
				}
				
			}
		}

		
	}


}