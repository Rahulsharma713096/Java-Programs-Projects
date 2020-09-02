package Assigment;
import java.util.Scanner;
public class C81 {
		
		public static void mergeArrays(int[] arr1, int[] arr2, int n1, 
									int n2, int[] arr3) 
		{ 
			int i = 0, j = 0, k = 0; 
		
			// Traverse both array 
			while (i<n1 && j <n2) 
			{ 
				if (arr1[i] < arr2[j]) 
					arr3[k++] = arr1[i++]; 
				else
					arr3[k++] = arr2[j++]; 
			} 
		
			// Store remaining elements of first array 
			while (i < n1) 
				arr3[k++] = arr1[i++]; 
		
			// Store remaining elements of second array 
			while (j < n2) 
				arr3[k++] = arr2[j++]; 
		} 
		
		public static void main (String[] args) 
		{  Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Length of 1st array:");
		int n1=sc.nextInt();
			int[] arr1 =new int[n1];
			System.out.println("Enter the Length of 2nd array");
		int n2=sc.nextInt();
			int[] arr2 =new int[n2]; 
			System.out.println("Enter the Elements of 1st Array");
			for(int i=0;i<=arr1.length-1;i++) {
				System.out.println("Enter the"+i+"th values:");
				arr1[i]=sc.nextInt();}
			System.out.println("Enter the Elements of 2nd Array");
			for(int i=0;i<=arr2.length-1;i++) {
				System.out.println("Enter the"+i+"th values:");
				arr2[i]=sc.nextInt();}
		
			int[] arr3 = new int[n1+n2]; 
			
			mergeArrays(arr1, arr2, n1, n2, arr3); 
			int temp;
			for(int i=0;i<=arr3.length-1;i++) {
				for(int j=i;j<=arr3.length-1;j++) {
					if(arr3[i]>arr3[j]) { temp=arr3[i]; arr3[i]=arr3[j]; arr3[j]=temp;} } }
			System.out.println("Array after merging & Sorting"); 
			for (int i=0; i < n1+n2; i++) 
				System.out.print(arr3[i] + " ");
			sc.close();
		} 
	} 

