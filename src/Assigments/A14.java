package Assigments;
import java.util.Scanner;
public class A14 {
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
	                                    	//Find min and max value
		int min=arr[0],max=arr[0];
		//max loop
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>=max) max=arr[i];
		} System.out.println("The max value is:"+max);
		//min loop
		int i=1;
		while(i<=arr.length-1)
		{
			if(arr[i]<=min) min=arr[i];
			i++;
			
		} System.out.println("The min value is:"+min);
	sc.close();
	}

}
