package CollectionInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class C1 {
public static void main(String[] args) {
	System.out.println("ArrayList");
	ArrayList<Integer>  ll =new ArrayList<Integer>();
ll.add(10);
ll.add(55);
ll.add(50);
ll.add(15);
ll.add(30);
ll.add(40);
ll.add(510);
System.out.println(ll);
System.out.println("LinkedList");
LinkedList<Integer> l1=new LinkedList<Integer>();
l1.add(10);
l1.add(55);
l1.add(50);
l1.add(15);
l1.add(30);
l1.add(40);
l1.add(510);
l1.push(20);
System.out.println(l1);
System.out.println("Vector");
Vector<Integer> v = new Vector<Integer>();
v.add(10);
v.add(82);
v.add(30);
v.add(40);
v.add(50);
v.add(60);
v.add(70);
System.out.println(v);
System.out.println("HashSet");
HashSet<Integer> hs = new HashSet<Integer>();
hs.add(10);
hs.add(52);
hs.add(30);
hs.add(40);
hs.add(50);
hs.add(60);
hs.add(70);
System.out.println(hs);
System.out.println("LinkesHashSet");
LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
lhs.add(14);
lhs.add(10);
lhs.add(14);
lhs.add(18);
lhs.add(20);
lhs.add(34);
lhs.add(44);
lhs.add(54);
System.out.println(lhs);
System.out.println("TreeSet");
TreeSet<Integer> ts = new TreeSet<Integer>();
ts.add(15);
ts.add(10);
ts.add(5);
ts.add(25);
ts.add(35);
ts.add(55);
ts.add(45);
ts.add(85);
System.out.println(ts);
System.out.println("Perority queue");
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
pq.add(15);
pq.add(45);
pq.add(25);
pq.add(65);
pq.add(35);
pq.add(55);
pq.add(95);
pq.add(85);
pq.add(10);
pq.add(34);
pq.add(99);
System.out.println(pq);



}
}
