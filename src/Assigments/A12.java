package Assigments;
import java.util.Scanner;
public class A12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		//size of array
		int n=sc.nextInt();
		//array decleration
		int arr[]=new int[n];
		//insert values in array
		System.out.println("Enter the Elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		//key value
		System.out.println("Enter the values w :");
		int w=sc.nextInt();
		for(int i=0,j=arr.length-1;i<=arr.length-1;i++,j--)
		{
			
			 if(arr[i]+arr[i]==w) System.out.println("Value present at location:"+i+"+"+i);
			else if(arr[j]+arr[j]==w) System.out.println("Value present at location:"+j+"+"+j);
			else if(arr[i]+arr[j]==w) System.out.println("Values Pransent at loaction:"+i+"+"+j);
		
		}
		sc.close();
	}

}
