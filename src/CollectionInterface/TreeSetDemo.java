package CollectionInterface;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(50);
		ts.add(50);
		ts.add(70);
		ts.add(60);
		ts.add(60);
		ts.add(60);
		ts.add(40);
		ts.add(40);
		ts.add(10);
		ts.add(20);
		ts.add(90);
		ts.add(20);
		ts.add(50);
		ts.add(20);
		ts.add(90);
		ts.add(20);
		System.out.println(ts);
		// first() ,last() ,headSet(), tailSet() ,susSet() 
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(50));
		System.out.println(ts.tailSet(50));
		System.out.println(ts.subSet(60, 90));
		
	//ceiling(),higher()	
		System.out.println(ts.ceiling(30));
		System.out.println(ts.higher(30));
		System.out.println(ts.ceiling(40));
		System.out.println(ts.higher(90));
		
	// floor(),lower()	
		System.out.println(ts.floor(30));
		System.out.println(ts.lower(30));
		System.out.println(ts.floor(20));
		System.out.println(ts.lower(20));
		System.out.println(ts.lower(10));
	}

}
