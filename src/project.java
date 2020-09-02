
public class project {
	public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			for(int j=1;j<=200;j++)
			{ 
				if((j==1&&i<=10)||(i==1&&j<=5)||(j==5&&i<=5)||(i==5&&j<=5)||(j>=5&&i==j&&i<=10)||(j==12&&i<=10)||(j>=12&&j<=15&&i<=5))
				System.out.print("*");
				
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
