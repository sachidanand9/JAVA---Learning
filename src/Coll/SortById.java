package Coll;
import java.util.Comparator;

public class SortById implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		
		Employee e2 = (Employee) o2;
		
		if (e1.id>e2.id) {
			return 4;
		}
		else if (e1.id<e2.id) {
			return -8;
		}
		return 0;
	}
	

}
