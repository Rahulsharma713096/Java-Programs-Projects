package Assigments;
import java.util.Scanner;
public class A9 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//Size of 1st array
	int s1=5;
	//size of 2nd array
	int s2=4;
	//declare the arrays
	int arr1[]=new int[s1];
	int arr2[]=new int[s2];
	//insert values in arrays
	System.out.println("Inset the value of Ist array:"); 
	for(int x=0;x<=arr1.length-1;x++)
	{
		System.out.println("Enter values:");
		arr1[x]=scan.nextInt();
	}
	System.out.println("Insert the values of 2nd array:");
	for(int c=0;c<=arr2.length-1;c++)
	{
		System.out.println("Enter the values");
	      arr2[c]=scan.nextInt();	
	}
	scan.close();
	//Declare the resultant array
	int res[]=new int[s1+s2];
	//Merge the values of both array
	for(int i=0,j=0;i<=arr1.length-1;i++)
	{
		res[j]=arr1[i];j=j+2;
	}
	for(int i=0,k=1;i<=s2-1;i++)
	{
		res[k]=arr2[i];k=k+2;
		
	}
	//Final Output of Programs
	System.out.println("The Merged vlues are");
	for(int x:res)
	{
		System.out.print(x+ " ");
	}
	
}
}
