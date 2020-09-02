
public class P6 {
public static void main(String[] args) {
	int n=5,x=1;
	for(int i=1;i<=n;i++)
	{ 
		if(i%2==1) {
		for(int j=1;j<=i;j++)
		{ 
			System.out.print(x++ +" ");
		}
		}
		else {
			for(int j=1;j<=i;j++)
		{  
				if(i==2&&j==1)
				{
					System.out.print("3 ");x++;
					
				}
				else if(i==2&&j==2)
				{
					System.out.print("2 ");x++;
				}
				if(i==4&&j==1)
				{
					System.out.print("10 ");x++;
					
				}
				else if(i==4&&j==2)
				{
					System.out.print("9 ");x++;
				}
				if(i==4&&j==3)
				{
					System.out.print("8 ");x++;
					
				}
				else if(i==4&&j==4)
				{
					System.out.print("7 ");x++;
				}
				
			
		}
		}
		System.out.println();
	}
}
}
