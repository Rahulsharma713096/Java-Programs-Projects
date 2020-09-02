package Assigment;
import java.util.Scanner;
public class C8 {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of Ist array:");
		int n=sc.nextInt();
		System.out.println("Enter The size of 2nd array:");
		int x=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[x];
		//Ist Array 
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the"+i+"th values:");
			arr[i]=sc.nextInt();}
		//2nd Array 
		for(int i1=0;i1<=arr1.length-1;i1++) {
			System.out.println("Enter the"+i1+"th values:");
			arr1[i1]=sc.nextInt();}
		//Printing both Arrays values
		System.out.println("The Arrays values of Ist Array:");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");}
		System.out.println();
		System.out.println("The Arrays values of 2nd Array:");
		for(int i2=0;i2<=arr1.length-1;i2++) {
			System.out.print(arr1[i2]+" ");}
		System.out.println();
		//Selection Sorting on array 1st
		int temp=0;
				for(int i=0;i<=arr.length-1;i++) {
				for(int j=i;j<=arr.length-1;j++) {
					if(arr[i]>arr[j]) { temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;}  } }
				//Selection Sorting on array 2nd
temp=0;				for(int i=0;i<=arr1.length-1;i++) {
				for(int j=i;j<=arr1.length-1;j++) {
					if(arr1[i]>arr1[j]) { temp=arr1[i]; arr1[i]=arr1[j]; arr1[j]=temp;} 	}   }
		
		//Merging Of both Arrays
		System.out.println("Merging Of Two Arrays:");
		int n2=(arr.length-1)+(arr1.length-1)+2;
		int arr3[]=new int[n2];
        int i = 0, j = 0, k = 0; 
	     while (i<arr.length && j <arr1.length) 
		{ 
			if (arr[i] < arr1[j]) 
				arr3[k++] = arr[i++]; 
			else
				arr3[k++] = arr1[j++]; 
		}  
		while (i < arr.length) 
			arr3[k++] = arr[i++];  
		while (j < arr1.length) 
			arr3[k++] = arr1[j++]; 
		
		for(int l=0;l<=arr3.length-1;l++) {
			System.out.print(arr3[l]+" ");
			}
		sc.close();
		}
	}


