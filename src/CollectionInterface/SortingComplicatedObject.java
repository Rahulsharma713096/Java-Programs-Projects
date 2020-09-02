package CollectionInterface;

import java.util.TreeSet;

public class SortingComplicatedObject {
	public static void main(String[] args) {
		TreeSet<student> studentlist = new TreeSet<student>(new MyCompactorStudent());
		studentlist.add(new student(1,"RAhul",75));
		studentlist.add(new student(2,"imran",65));
		studentlist.add(new student(3,"yuvraj",85));
		System.out.println(studentlist);
	}

}
