package com.abc.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Launch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("Enter the integer value and enter y to exit:");
		while(sc.hasNextInt()) {
			System.out.println(l1.add(sc.nextInt()));
			
		}
		System.out.println(l1);
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.hasNext());
		}
	sc.next();
		Vector<Integer> v1 = new Vector<Integer>();
		System.out.println("Enter the integer value and enter y to exit:");
		while(sc.hasNextInt()) {
			System.out.println(v1.add(sc.nextInt()));
			}
		System.out.println(v1.size());
		System.out.println(l1.size());
		sc.close();
	}

}
