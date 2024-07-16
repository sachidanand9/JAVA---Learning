package Map;

import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;

public class Driver {
  public static void main(String[] args) {
	LinkedHashMap<Integer, String> h = new LinkedHashMap();
	
	h.put(1, "Deep");
	h.put(3, "Anil");
	h.put(5, "Honey");
	h.put(9, "Prince");
	h.put(2, "Susan");
	
	System.out.println(h);
}
}
