package CollectionInterface;

import java.util.Comparator;

public class MyCompactorStudent implements Comparator<student> {

	@Override
	public int compare(student s1, student s2) {
		// as per Name
		int x=s1.getName().compareTo(s2.getName());
		return x*-1;
	}

}
