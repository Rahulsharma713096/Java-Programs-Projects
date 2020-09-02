package CollectionInterface;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueProg1 {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	Scanner sc = new Scanner(System.in);
	//taking input from user
	System.out.println("Enter the any Integer Input and enter exit when done:");
	while(true) {
	try {	int data = sc.nextInt();
		pq.add(data);}
	catch(Exception e){
		break;
		}
		System.out.println(pq+"------->Code Runing");
	}
	System.out.println(pq);
	sc.close();
}
}
