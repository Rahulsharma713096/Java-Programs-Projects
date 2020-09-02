package CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IterableDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
	System.out.println("Enter the Inerger and enrer any charcter to exit:");
	while(sc.hasNextInt()) {
		al.add(sc.nextInt());
	}
	Iterator<Integer> itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	sc.close();
	}

}
