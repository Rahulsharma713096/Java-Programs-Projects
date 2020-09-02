package Search;
import java.util.Scanner;
public class Linear {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	//Enter the Size Array
	System.out.println("Enter the Number of Elements :");
	int size=Scan.nextInt();
	int arr[]=new int[size];
	//Elements to be inserted
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
	boolean flag= false; //flag for if value not found
	for(int i=0;i<=size-1;i++)
	{
		if(arr[i]==key)
		{
			System.out.println("Elements are founded");
			System.out.println("In position of:"+i);
			flag=true;
			break;
	
		}
	}
	if(flag==false)
		System.out.println("Elements Not Founded");
}
}
