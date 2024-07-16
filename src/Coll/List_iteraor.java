package Coll;
import java.util.ArrayList;
import java.util.ListIterator;
public class List_iteraor {
 public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(11);
	al.add(12);
	al.add(23);
	
	ListIterator li = al.listIterator(4);
	
	System.out.println(li.hasPrevious());
	System.out.println(li.previous());
	System.out.println(li.previous());
	System.out.println(li.previous());
	System.out.println(li.previous());
	System.out.println(li.hasPrevious());
	System.out.println(li.next());
	
	// Also use while loop
	
	while (li.hasPrevious()) {
		System.out.println(li.previous());
	}
}
}
