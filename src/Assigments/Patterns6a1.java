package Assigments;

public class Patterns6a1 {
public static void main(String[] args) {
	int n=4,c=1,x=0;
	for(int i=0;i<=n;i++)
	{ if(i==1) x=3; else if(i==3) x=10;
		for(int j=0;j<=i;j++)
		{ 
			if(i%2==1)
		       { 
				if(x<10) { System.out.print("0"+x-- +" "); c++; }
		        else { System.out.print(x-- +" "); c++; }
	           } 
			else {
		       if(c<=9) System.out.print("0"+ c++ +" ");
		       else 	System.out.print(c++ +" "); }
		}
		System.out.println();
	}
}
}
