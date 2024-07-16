package Coll;

import java.util.ArrayList;
import java.util.ListIterator;

//import java.util.ListIteraor;
public class Test2 {
	

 public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Ajay");
	al.add("Srk");
	al.add("Julit");
	al.add("Samra");
	
	ListIterator i =al.listIterator();
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println("----------------");
	System.out.println(i.previous());
	System.out.println(i.previous());
	System.out.println(i.previous());
	System.out.println(i.previous());
	
	
	// Also do with while loop 
	
	while (i.hasNext()) {
		System.out.println(i.next());
	}
	
	System.out.println("----------------");
	
	while(i.hasPrevious()) {
		System.out.println(i.previous());
	}
}
}
