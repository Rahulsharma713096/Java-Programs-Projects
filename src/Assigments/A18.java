package Assigments;
import java.util.Scanner;
public class A18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//take the string and store
		System.out.println("Enter the Sentence :");
		String a=sc.nextLine();
		a=a.trim();
		String res="";
		// Take key value
		System.out.println("Enter the character which is to be remove:");
		String k=sc.next();
		int space=0; char pc=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char c=a.charAt(i); 
		if(i>0)	{
			int j=i-1;
			 pc=a.charAt(j); }
		char k1=k.charAt(0);
			if(c==k1)
			{
				space++;
		continue;
				
			}
			else {
				if(pc==' ') res+=' ';
				res+=c;
			}
		}
		System.out.println(res);
		sc.close();
	System.out.println("The Number of Character Remove Are:"+space);
	}

}
