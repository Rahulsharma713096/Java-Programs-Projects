package Assigments;
import java.util.Scanner;
public class a8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//size of the array
		System.out.println("Enter The Number of Elements:");
		int n=s.nextInt();
		int a[]=new int[n];
		//insert values in array
		System.out.println("Enter the values");
		for(int i=0;i<=a.length-1;i++)
		{   System.out.println("Enter the "+i+" value:");
			a[i]=s.nextInt();
		}
		s.close();
		//sum of all even index array elements
		System.out.println("sum of all even index array elements:");
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
			x=a[i]+x;
			}
		}
		System.out.println(x);
		//Product of all even index array elements
		System.out.println("Product of all even index array elements:");
		int y=1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
			y=a[i]*y;
			}
		}
		System.out.println(y);
		
	}

}
