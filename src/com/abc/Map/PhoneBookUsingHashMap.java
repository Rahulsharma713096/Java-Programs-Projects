package com.abc.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class PhoneBookUsingHashMap {
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
		//print the Name(key)
		Set<String> name = phonebook.keySet();
		for(String names:name) {
			System.out.println(names);
		}
		//print the Phone number(values)
		Collection<String> values = phonebook.values();
		for(String value:values) {
			System.out.println(value);
		}
		//print the name and phone numbers(entry)
		Set<Entry<String, String>> entries = phonebook.entrySet();
		for(Entry<String, String> ent:entries) {
			System.out.println(ent);
		}
		scan.close();
	}
}
