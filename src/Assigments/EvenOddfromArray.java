package Assigments;
import java.util.Scanner;
public class EvenOddfromArray {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		//size of array from user
		System.out.println("Enter the Length of array:");
		int size=Scan.nextInt();
		//Declare array
		int a[]=new int[size];
		int res[]=new int[size];
		//insert values in array
		for(int i=0;i<=a.length-1;i++)
		{ System.out.println("Enter the number:");
			a[i]=Scan.nextInt();
		}
		
		//gets odd and even values
		System.out.print("The Even Number is:");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+"  ");
			
			else
				res[i]=a[i];
		}
		System.out.print(" \n The Odd Number is:");
		for(int i=0;i<=res.length-1;i++)
		{
			System.out.print(res[i]+"  ");
		}
	Scan.close();
	}

}
