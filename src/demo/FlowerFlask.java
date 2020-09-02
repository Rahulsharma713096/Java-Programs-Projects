package demo;

public class FlowerFlask {
	
public static void main(String[] args) {

	System.out.println("This is Flowe Flask");
	
	for(int i=1;i<=15;i++)
	{
		for(int j=1;j<=15;j++)
		{
			if(i==15||(j==4&&i<=10)||(j==11&&i<=10)||(i+j==15&&i>10)||(i==j&&i>10))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
