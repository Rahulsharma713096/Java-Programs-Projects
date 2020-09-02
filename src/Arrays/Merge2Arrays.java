package Arrays;
import java.util.Scanner;
public class Merge2Arrays {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//Size of 1st array
	System.out.println("Enter the size of Ist Array:");
	int s1=scan.nextInt();
	//size of 2nd array
	System.out.println("Enter the size of 2nd array:");
	int s2=scan.nextInt();
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
	for(int i=0;i<=arr1.length-1;i++)
	{
		res[i]=arr1[i];
	}
	for(int i=0,k=s1;i<=s2-1;i++,k++)
	{
		res[k]=arr2[i];
		
	}
	//Final Output of Programs
	System.out.println("The Merged vlues are");
	for(int x:res)
	{
		System.out.print(x+ " ");
	}
	
}
}
