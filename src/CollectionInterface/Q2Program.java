package CollectionInterface;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q2Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter Websites by Seperating them using ','");
		String[] links=scan.next().split(",");
		//remove duplicates
		TreeSet<String> websites = new TreeSet<String>();
		for(String temp:links) {
			websites.add(temp);
		}
	// Display using iterator
		 Iterator<String> itr = websites.iterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next());
			 if(itr.hasNext()) System.out.print(",");
		 }
		 System.out.println();
   //Display using SOPL
		 System.out.println(websites);
	//Display using ForEach LOOP
		 for(String t:websites) {
			 System.out.print(t+",");
		 }
		 scan.close();
	}

}
