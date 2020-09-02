package com.abc.CollectionsClassPRograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class UseOfCollectionInArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		//user Define Input
		System.out.println("Enter Integer values and when done enter Exit");
		while(true) {
			try {
				al1.add(sc.nextInt());
			}catch(Exception e){
				break;
			}
			System.out.println(al1+"------->Input Loop Running");
		}
		System.out.println("After Input the ArrayList :  "+al1);
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println(Collections.binarySearch(al1,10));
	}
}
