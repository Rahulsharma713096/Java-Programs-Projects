package CollectionInterface;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIterableDemo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the data and when done enter any character:");
		while(sc.hasNextInt()) {
			al.add(sc.nextInt());
		}
		System.out.println(al);
		//forward and the backward
		ListIterator<Integer> itr1 = al.listIterator();
		System.out.println("Forward");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Backward");
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		//Backward only
		ListIterator<Integer> itr2 = al.listIterator(al.size());
		System.out.println("Backward only");
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		sc.close();
	}

}
