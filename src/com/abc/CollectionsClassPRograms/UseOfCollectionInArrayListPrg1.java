package com.abc.CollectionsClassPRograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import CollectionInterface.MyCompactorStudent;
import CollectionInterface.student;

public class UseOfCollectionInArrayListPrg1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<student> al = new ArrayList<student>();
	//Taking Input From user
	System.out.println("Enter the Students Detais S_Id,S_Name,S_Marks when done enter exit in S_id column ");
int i=1;
	while(true) {
		System.out.println("Enter the  "+i+"th Student Details");
		try {
			System.out.println("Enter the   "+i+"th Student Id:");
		int id=sc.nextInt();
		System.out.println("Enter the   "+i+"th Student Name:");
		String name=sc.next();
		System.out.println("Enter the   "+i+"th Student Marks:");
		int marks=sc.nextInt();
		al.add(new student(id,name,marks));
		}catch(Exception e) {
			break;
		}
		i++;
		System.out.println(al+"--------> Input Window Running");
	}
	System.out.println(al);
	System.out.println("After Sortin Perform Name wise in Decending order: ");
	Collections.sort(al,new MyCompactorStudent());
	System.out.println(al);
	sc.close();
}
}
