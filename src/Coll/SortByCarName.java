package Coll;

import java.util.Comparator;

public class SortByCarName implements Comparator {
	
	public int compare (Object o1, Object o2) {
		Car c1 = (Car) o1;
		Car c2 = (Car) o2;
		
		return c1.name.compareTo(c2.name);
	}

}
