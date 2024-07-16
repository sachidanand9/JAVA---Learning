package Vector;

import java.util.Collections;
import java.util.TreeSet;

public class Test2 {
public static void main(String[] args) {
	TreeSet t = new TreeSet(Collections.reverseOrder());
	t.add(7);
	t.add(5);
	t.add(2);
	t.add(6);
	t.add(9);
	
	System.out.println(t);
}
}
