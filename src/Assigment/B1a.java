package Assigment;
import java.util.Scanner;
public class B1a {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=d.nextInt();
int e=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0) 
		{
			
		e++;
		}
	}
	if(e==2)
	{
		System.out.println("Number is Prime");
	}
	else if(e>=2)
	{
		System.out.println("The number is not Prime");
	}
d.close();
}
}