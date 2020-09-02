package Assigment;
import java.util.Scanner;
public class B1 {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=d.nextInt();
	if(n==1||n==0) { System.out.println("The number is not Prime"); System.exit(0); }
	boolean f=false;
	for(int i=2;i<=n-1;i++)
	{
		if(n%i==0) {
			
			f=true;
		}
	}
	if(f==false)
		System.out.println("Number is Prime");
	else System.out.println("The number is not Prime");
	d.close();
}
}
