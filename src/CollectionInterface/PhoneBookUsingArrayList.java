package CollectionInterface;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class PhoneBookUsingArrayList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> phonebook = new ArrayList<String>();
		//Input
		System.out.println("Enter the name=phone number and when done enter exit");
		while(true){
			String data = scan.next();
			if(data.equalsIgnoreCase("exit")) break;
			else {
				phonebook.add(data);
		     }
		}
		//print name=phone numbers
		ListIterator<String> ls = phonebook.listIterator();
		while(ls.hasNext())System.out.println(ls.next());
		
		//print the Name
		ListIterator<String> ls1 = phonebook.listIterator();
		while(ls1.hasNext()) {
			String[] split = ls1.next().split("=");
			System.out.println(split[0]);
		}
		//print numbers
		ListIterator<String> ls2 = phonebook.listIterator();
		while(ls2.hasNext()) {
			String[] split = ls2.next().split("=");
			System.out.println(split[1]);
		}
		
		scan.close();
	}

}
