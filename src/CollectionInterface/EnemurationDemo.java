package CollectionInterface;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class EnemurationDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
Vector<Integer> v = new Vector<Integer>();	
System.out.println("Enter the integer and enter any character to exit");
while(sc.hasNextInt()) {
	v.add(sc.nextInt());
}
	Enumeration<Integer> e1 = v.elements();
while(e1.hasMoreElements())
{
	System.out.println(e1.nextElement());
}
sc.close();
}	
}
