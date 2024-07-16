package Coll;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
 public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Arman");
	al.add("Vijay");
	al.add("Himanshu");
	al.add("Ajay");
	System.out.println(al.size()); // its give the size of the strings that we used or declared 
	
	System.out.println(al.contains("Vijay")); // its return true if the value is present or else return false if the given input is not present in the array string 
	 for(int i = 0; i<al.size();i++) {
		 System.out.println(al.get(i));
		 
	 }
	
}
}
