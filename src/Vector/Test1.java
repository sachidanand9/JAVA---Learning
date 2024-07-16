package Vector;

import java.util.LinkedHashSet;

public class Test1 {
public static void main(String[] args) {
	LinkedHashSet l = new LinkedHashSet();
	l.add(6);
	l.add("Sucha");
	l.add(6);
	l.add(9.80);
	l.add('A');
	l.add(null);
	l.add(null);
	l.add(true);
	
	for(Object o: l) {
		System.out.println(o);
	}
}
}
