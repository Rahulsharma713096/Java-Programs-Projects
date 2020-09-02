package Assigment;
import java.util.Scanner;
public class C7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of first Array :");
	int a=sc.nextInt();
	System.out.println("Enter the size of 2nd Array :");
	int b=sc.nextInt();
	System.out.println("Enter the size of 3rd Array :");
	int c=sc.nextInt();
	int a1[]=new int[a]; int a2[]=new int[b]; int a3[]=new int[c];
	System.out.println("Enter the Data Should be Sorted in Arrays");
	System.out.println("Enter the 1st Array Data:");
	for(int i=0;i<=a1.length-1;i++)
	{
		System.out.println("Enter The Value at"+i+"Position:");
		a1[i]=sc.nextInt();
	}
	System.out.println("Enter the 2nd Array Data:");
	for(int i=0;i<=a2.length-1;i++)
	{
		System.out.println("Enter The Value at"+i+"Position:");
		a2[i]=sc.nextInt();
	}
	System.out.println("Enter the 3rd Array Data:");
	for(int i=0;i<=a3.length-1;i++)
	{
		System.out.println("Enter The Value at"+i+"Position:");
		a3[i]=sc.nextInt();
	}
	int i=0;
	//Checking And Print common Elements
	while(i<=a1.length-1&&i<=a2.length-1&&i<=a3.length-1) //while loop
	{ System.out.println("Computing:"+i);
	for(int k=0;k<=a1.length-1&&k<=a2.length-1&&k<=a3.length-1;k++) //for loop inside while
	{	for(int k1=0;k1<=a1.length-1&&k1<=a2.length-1&&k1<=a3.length-1;k1++) //for loop inside for whic is inside while loop
	{ if(a1[i]==a2[k]) {
			if(a2[k]==a3[k1]) System.out.println("Array A1 and A2 and A3 elements Common:"+a1[i]+","+a2[k]+","+a3[k1]);
			}	}	}
	     i++;}
	sc.close();
}
}
