package com.abc.Map;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class AssignmentPairsInInputString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedHashMap<Character, Integer> table = new LinkedHashMap<Character, Integer>();
		//Input
		System.out.println("Enter the Word:");
	  String word = scan.nextLine();
	  //Start counting Character
	  for(int i=0;i<word.length();i++) {
		  char c = word.charAt(i);
		  if(table.containsKey(c)) {
			                               //increase the count
			                           Integer count=table.get(c);
			                           table.put(c,++count);
		                                                }
		  else {
			  //inserting character in the table
			  table.put(c, 1);
		  }
	  }
	  //Display
	  Set<Character> key = table.keySet();
	  for(Character keys:key) {
		  if(keys==' '||keys=='\t') System.out.println("Number of spsces :"+table.get(keys));
	  else  System.out.println(keys+":"+table.get(keys));
	  }
	  //Printing Pair of Input Stings character
	  System.out.println("Number of Pairs in input string of every Character:");
	  for(Character keys:key) {
		  if(keys==' '||keys=='\t') System.out.println("Number of spsces :"+table.get(keys)/2);
	  else  System.out.println(keys+":"+table.get(keys)/2);
	  }
	  scan.close();
	}
}
