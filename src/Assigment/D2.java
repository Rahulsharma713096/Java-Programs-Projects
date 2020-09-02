package Assigment;

public class D2 {
public static void main(String[] args) {
	int n=3,c=1;
	for(int i=0;i<=n;i++)
	{ 
		for(int j=1;j<=n-i;j++) 
			System.out.print(" ");
		for(int j=0;j<=i;j++) {
			if (j==0||i==0||j==i) { c=1; System.out.print(" "+c);}
			else 
			System.out.print(" "+i);
			}
		System.out.println(); 
		}
			
}
}