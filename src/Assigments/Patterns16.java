package Assigments;
public class Patterns16 {
public static void main(String[] args) {
	int k1=1,k2=17;
	for(int i=0;i<=4;i++)
	{ if(i==1) k2=14; else if(i==2) k2=12; else if(i==3) k2=11;
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(8-i);k++)
		{ 
			if(k<=4-i) {
			System.out.print(k1++ +"*");} 
			else if(k>=5 && k<=8-i+1) { if(k==8-i) System.out.print(k2++);
			else System.out.print(k2++ +"*");}
		}
	
		System.out.println();
		
	}
}
}
