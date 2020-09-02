package Arrays;
import java.util.Scanner;
public class a1 {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	int a[]=new int[5];
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter the value of"+i+" : ");
		a[i]=Scan.nextInt();
	}
	System.out.println("The output is:");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	
	}
	Scan.close();
}
}
