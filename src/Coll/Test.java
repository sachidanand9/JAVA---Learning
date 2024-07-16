package Coll;
import java.util.ArrayList;
import java.util.Iterator;
public class Test {
 public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(12);
	al.add(32);
	al.add(22);
	
	Iterator i = al.iterator();
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
//	System.out.println(i.next()); ----> this will throw error 
	
	while (i.hasNext()) {
		System.out.println(i.next());
	}
}
}
