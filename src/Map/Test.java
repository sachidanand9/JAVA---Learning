package Map;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(2, "Raju");
		h.put(3, "Kalia");
		h.put(1, "Bheem");
		h.put("POGO", "Chutki");
		
		System.out.println(h);
		System.out.println(h.get(null)); // it is used to get the object from key value.
		System.out.println(h.get(3));
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.entrySet());
		h.put(4,"Tun Tun Massi");
		System.out.println(h.containsKey(3));
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		h.clear();
		
	}

}
