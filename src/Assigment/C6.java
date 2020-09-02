package Assigment;
import java.util.Scanner;
public class C6 {
	public static void main(String[] args) { int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the"+i+"th values:");
			arr[i]=sc.nextInt();}
		System.out.println("The Arrays values Before Sorting:");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");}
		//Selection Sorting
		for(int i=0;i<=arr.length-1;i++) {
		for(int j=i;j<=arr.length-1;j++) {
			if(arr[i]>arr[j]) { temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;}
	                                   	}
		                                   }
		System.out.println("\n The Arrays values After Sorting:");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");}
		sc.close();
		}
	}


