package Assigment;
import java.util.Scanner;
public class A22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take size of Matrix
		System.out.println("Enter The size of n value of Square Matrix :");
		int n1=sc.nextInt();

		//Declare matrix or 2-D array
		int a[][]=new int[n1][n1];
		//Take values To array
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++)
			{ System.out.println("Enter the value at loaction"+i+","+j);
				a[i][j]=sc.nextInt();
			} }
		//original Matrix 
	                                               	System.out.println("original Matrix ");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++)
			{ System.out.print(a[i][j] +" ");
			
			} System.out.println(); }
		//Rotate towards Right
                                               System.out.println("Matrix roatate towards right:");
for(int i=0;i<=a.length-1;i++) {
	for(int j=a[i].length-1;j>=0;j--)
	{ System.out.print(a[j][i] +" ");
	
	} System.out.println(); }

sc.close();
	}

}
