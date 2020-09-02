package Arrays;
import java.util.Scanner;
public class a2 {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	int a[][]=new int[3][4];
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++)
		{
		System.out.println("Enter the value of i:"+i+" ,j: "+j);
		a[i][j]=Scan.nextInt();
	}
	}
	System.out.println("The output is:");
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++)
		{
		System.out.println(a[i][j]);
		}
		
	}
	Scan.close();
}
}
