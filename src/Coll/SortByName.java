package Coll;

import java.util.Comparator;

//import java.util.Comparator;p

public class SortByName implements Comparator{
   
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return e1.name.compareTo(e2.name); 
	}
}
