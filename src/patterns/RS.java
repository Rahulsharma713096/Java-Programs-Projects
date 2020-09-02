package patterns;

public class RS {
	public static void main(String[] args) {
		
	 for(int i=1;i<=10;i++)
	 {
		 for(int j=1;j<=10;j++)
		 {
			 if(j==1||i==1||(j==10&&i<=4)||i==4)
				 System.out.print("*");
			 else System.out.print(" ");
			 if(j>=4&&j>=4&&i==j)
			 {
				 System.out.print("*");
			 }
		 }
		 System.out.println("");
	 }
	 System.out.println("\n \n");
	 for(int i=1;i<=10;i++) {
		 for(int j=1;j<=10;j++)
		 {
			if(i==1||(i==5&&j<=10)||(i<=5&&j==1)||(i>=5&&j==10)||i==10)
			 System.out.print("*");
			else System.out.print(" ");
		 } System.out.println("");
	 }
	}

}
