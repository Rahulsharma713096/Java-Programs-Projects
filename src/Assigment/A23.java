package Assigment;
import java.util.Scanner;
public class A23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take size of Matrix
		System.out.println("Enter The size of n value of Square Matrix :");
		int n=sc.nextInt();

		//Declare matrix or 2-D array for Matrix
		int a[][]=new int[n][n];
		//Take values To array and insert it
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++)
			{ System.out.println("Enter the value at loaction"+i+","+j);
				a[i][j]=sc.nextInt();
			} }
		//original Matrix 
	                                               	System.out.println("The Original Matrix ");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++)
			{ System.out.print(a[i][j] +" ");
			
			} System.out.println(); }
		//Rotate towards Left
                                               System.out.println("Matrix roatate towards Left:");
for(int i=a.length-1;i>=0;i--) {
	for(int j=0;j<=a[i].length-1;j++)
	{ System.out.print(a[j][i] +" ");
	
	} System.out.println(); }

sc.close();
	}

}
