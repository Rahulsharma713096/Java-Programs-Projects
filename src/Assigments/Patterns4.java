package Assigments;

public class Patterns4 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{ if((i==3&&j==2)||(i==4&&j==2)||(i==4&&j==3))
				System.out.print(0+" " );
			else System.out.print(1+" ");
			}System.out.println();
		}
	}

}
