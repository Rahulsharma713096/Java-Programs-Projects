package demo;
import java.util.Scanner;
public class A1 {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the has to be checked:");
	int n=d.nextInt();
	int c=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0) c++;
	}

	 if(c==2) System.out.println("The number is Prime");
	else System.out.println("Number Not Prime");
	d.close();
}
}
