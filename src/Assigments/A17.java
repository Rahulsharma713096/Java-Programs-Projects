package Assigments;
import java.util.Scanner;
public class A17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		//size of array
		int n=sc.nextInt();
		//array declare
		int arr[]=new int[n];
		//insert values in array
		System.out.println("Enter the Elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
	                                    	//Find max value or Largest value
		int max=arr[0]; int sl=arr[0];
		//max loop
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>=max) max=arr[i];  
			}
		//Second Largest loop
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]!=max&&arr[i]>sl) sl=arr[i];  
			}
		System.out.println("The max value is:"+max);
		System.out.println("The Second Largest values is:"+sl);
	
	sc.close();
	}

}
