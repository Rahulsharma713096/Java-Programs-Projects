package com.abc.Map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProg {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
HashMap<String, Integer> hm = new HashMap<String,Integer>();
//Input
System.out.println("Enter the Detais and When done Enter Exit:");
while(true) {
	String data = scan.next();
if(data.equalsIgnoreCase("exit")) break;
else {
 String[] split = data.split("=");
 hm.put(split[0],Integer.parseInt(split[1]));
 }
}
//Input for Fetching Data
System.out.println("Enter the name for Fatching their Details:");
String[] name=new String[hm.size()];
for(int i=0;i<hm.size();i++) {
	String data = scan.next();
	if(data.equalsIgnoreCase("exit"))
	break;
	else name[i]=data;
}
//Display
for(String key:name) {
	if(hm.containsKey(key))
		System.out.println(hm.get(key));
	else System.out.println("Person Missing");
}
scan.close();
}
}
