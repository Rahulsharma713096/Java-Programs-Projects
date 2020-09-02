package Assigments;
import java.util.Scanner;
public class A15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//take the string and store
		System.out.println("Enter the Sentence :");
		String a=sc.nextLine();
		a=a.trim();
		String res="";
		int space=0; char pc=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char c=a.charAt(i); 
		if(i>0)	{
			int j=i-1;
			 pc=a.charAt(j); }
			if(c==' ' && c!='\t')
			{
				space++;
				
			}
			else {
				if(pc==' ') res+=' ';
				res+=c;
			}
		}
		System.out.println(res);
		sc.close();
		System.out.println("The Number of spaces:"+space);
	}

}
