package demo;

public class D10 {
public static void main(String[] args) {
	int n=4,c=1,x=0;
	for(int i=0;i<=n;i++)
	{ if(i==1) x=3; else if(i==3) x=10;
		for(int j=0;j<=i;j++)
		{ if(i%2==1)
		{
			System.out.print(x--+" "); c++;
		}
		else 	System.out.print(c++ +" ");
		}
		System.out.println();
	}
}
}
