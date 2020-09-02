package Assigment;
import java.util.Scanner;
class PascalTriangle{
	int fact(int a)
	{ int i=a,fact=1;
		while(i>=1) {fact*=i;  i--;}
		return fact;
	}
	int Ncn(int n,int r) { int x=n,y=r;
		return fact(x)/(fact(x-y)*fact(y));
	}
}
public class D3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	PascalTriangle p=new PascalTriangle();
	System.out.println("Enter the Number of Rows:");
	int value=sc.nextInt(); value-=1;
	for(int i=0;i<=value;i++) {
		for(int j=0;j<=value-i;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++){
			System.out.print(" "+p.Ncn(i, j));
		}
	System.out.println();
	}
	sc.close();
}
}
