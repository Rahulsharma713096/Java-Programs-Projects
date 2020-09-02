package Assigments;

public class Patterns71 {
public static void main(String[] args) {
	int n=6;
	for(int i=1;i<n;i++)
	{
		for(int k=1;k<=(n-i+1);k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=(2*i-1);j++)
		{  if(i%2==0&&j%2==1)
			System.out.print(i);
		else if(i%2==1&&j%2==1)
			System.out.print(i);
		else
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
