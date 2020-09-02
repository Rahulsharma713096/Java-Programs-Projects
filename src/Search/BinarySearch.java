package Search;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
	 Scanner Scan=new Scanner(System.in);
	//Enter the Size Array
	System.out.println("Enter the Number of Elements :");
	int size=Scan.nextInt();
	int arr[]=new int[size];
	//Elements to be inserted
	System.out.println("Enter The elements in Sorted order");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter elements:");
		arr[i]=Scan.nextInt();
	}
	//Enter the key Elements
	System.out.println("Enter the elements to be search:");
	int key=Scan.nextInt();
	//close Scan object
	Scan.close();
	//start searching key elements
	int first=0,last=size-1,mid;
	boolean flag= false; //flag for if value not found
	while(first<=last)
	{
		mid=(first+last)/2;
		if(arr[mid]==key)
		{
			System.out.println("Elements are Founded");
			flag=true; break;
		}
		else if(arr[mid]<key)
		{
			first=mid+1;
		}
		else
		last=mid-1;
	}
	if(flag==false)
		System.out.println("Elements Not Founded");
}
}
