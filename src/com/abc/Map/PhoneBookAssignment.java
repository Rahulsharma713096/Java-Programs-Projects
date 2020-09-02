package com.abc.Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class PhoneBookAssignment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> phonebook = new HashMap<String,String>();
		//Input
		System.out.println("Enter the name=phone number and when done enter exit");
		while(true){
			String data = scan.next();
			if(data.equalsIgnoreCase("exit")) break;
			else {
				String[] split = data.split("=");
				phonebook.put(split[0], split[1]);
			}
		}
		
		//print the phone number get(key)
		Set<String> keySet = phonebook.keySet();
		for(String key:keySet)System.out.println(phonebook.get(key));
		//print Names get(value)
		Set<String> k = phonebook.keySet();
		for(String value:k) System.out.println(value);
		//print the name and phone number using enteryset()
		Set<Entry<String, String>> es = phonebook.entrySet();
		System.out.println(es);
		scan.close();
	}

}
