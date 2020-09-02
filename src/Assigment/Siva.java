package Assigment;
import java.util.Scanner;
public class Siva 
{
public static void main(String[] args) 
{  Scanner d=new Scanner(System.in);
System.out.println("Enter the the number where you know prime number");
int n1=d.nextInt();
System.out.println("The number is Prime: 1");
	for(int k=1;k<=n1;k++)
	{ 
		int c=0;
  for(int i=1;i<=k;i++)
  {
	  if(k%i==0)
	  {
		 c++;
	  }
	  
  }
  if(c==2)
	  System.out.println("The number is Prime: " +k);
}
 d.close();
}
}