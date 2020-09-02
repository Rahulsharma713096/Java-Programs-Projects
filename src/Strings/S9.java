package Strings;

public class S9 {
public static void main(String[] args) {
	String s1=new String("RAMA");
	String s2=new String("RAMA");
	String s3=s1+s2;
	String s4=s1+s2;
	if(s3==s4)
	System.out.println("Rerfremce are Equal");
	else System.out.println("Reference are not equal");
}
}
