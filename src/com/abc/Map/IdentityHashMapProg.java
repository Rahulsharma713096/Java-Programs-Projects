package com.abc.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapProg {
public static void main(String[] args) {
	String s1 = new String("RAMA");
	String s2 = new String("RAMA");
IdentityHashMap<String, Integer> map = new IdentityHashMap<String,Integer>();
map.put(s1, 10);
map.put(s2, 20);
System.out.println(map);
}
}
