package com.abc.Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapForOccranceOfCharacter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	HashMap<Character, Integer> table = new HashMap<Character, Integer>();
	//Input
	System.out.println("Enter the Word:");
  String word = scan.next();
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
  for(Character keys:key) System.out.println(keys+":"+table.get(keys));
  scan.close();
}
}
