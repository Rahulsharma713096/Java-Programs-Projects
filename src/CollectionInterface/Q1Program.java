package CollectionInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q1Program {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
System.out.println("Enter the String");
String str= scan.next();
//Sorting the String inside HashSet Char by Char
HashSet<Character> hs = new HashSet<Character>();
for(int i=0;i<str.length();i++) {
	hs.add(str.charAt(i));
}
//Display
Iterator<Character> itr = hs.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next());
}
scan.close();
}
}
