package Assigment;
import java.util.Scanner;
public class A2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//size of array
	System.out.println("Enter the number of Elements");
	int n=sc.nextInt();
	//array decleration
	int arr[]=new int[n];
	//store values in arrays
	for(int i=0;i<=arr.length-1;i++)
	{ System.out.println("Enter values:");
		arr[i]=sc.nextInt();
		
	}
	//change array values
	for(int i=0;i<=arr.length-1;i++)
	{ System.out.println();
		arr[i]=120/arr[i];
		
	}
	//retrive and show final outputs
	System.out.println("Final output are:");
	for(int i=0;i<=arr.length-1;i++)
	{ System.out.print(arr[i]+" ");
	
		
	}
	sc.close();
}
}
