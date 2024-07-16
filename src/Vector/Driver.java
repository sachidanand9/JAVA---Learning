package Vector;

import java.util.TreeSet;

public class Driver {
 public static void main(String[] args) {
	TreeSet t = new TreeSet();
	
	t.add(new Student2(12, "Nitish"));
	t.add(new Student2(32, "Nitin"));
	t.add(new Student2(72, "Nitesh"));
	
	System.out.println(t);
		}
}
