package Assigment;
import java.util.Scanner;
public class A3 {
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
	// find min,max,Sum
	int min=arr[0],max=arr[0],sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{ sum+=arr[i];
	if(arr[i]>max) max=arr[i];
	else if(arr[i]<min) min=arr[i];
		
	}
	//retrive and show final outputs
	System.out.println("Final output are:");
	System.out.println("Min-Sum-Value:"+ (sum-max));
	System.out.println("Max-Sum-Value:"+ (sum-min));
	System.out.println("THE sum is:" + sum);
	
	sc.close();
}
}
