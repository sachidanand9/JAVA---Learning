package Vector;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
public static void main(String[] args) {
	HashSet h = new HashSet();
	Student s1 = new Student(1, "Honey");
	Student s2 = new Student(2, "Honey");
	Student s3 = new Student(3, "Money");
	h.add(s1);
	h.add(s2);
	h.add(s3);
	
	Iterator i =h.iterator();
	
	while (i.hasNext()) {
		System.out.println(i.next());
		
	}
	 
//	System.out.println("HashSet shows values after removing dupticate from the set :"+h);
}
}
