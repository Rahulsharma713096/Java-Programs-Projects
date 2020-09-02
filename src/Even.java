import java. util.Scanner;
public class Even {
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=Scan.nextInt();
	if(n%2==0)
		System.out.println("Even");
	else
		System.out.println("odd");
	Scan.close();
}
}
