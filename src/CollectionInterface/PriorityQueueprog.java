package CollectionInterface;

import java.util.PriorityQueue;
import java.util.Scanner;


public class PriorityQueueprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> pq = new PriorityQueue<String>();
Scanner sc = new Scanner(System.in);
//taking input from user
System.out.println("Enter the any Input and enter exit when done:");
while(true) {
	String data = sc.next();
	if(data.equalsIgnoreCase("exit")) break;
	else pq.add(data);
}

System.out.println(pq);
sc.close();
	}

}
