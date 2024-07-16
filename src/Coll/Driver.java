package Coll;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Marker> a = new ArrayList<Marker>();

		a.add(new Marker("camel", 150));
		a.add(new Marker("Nova", 250));
		a.add(new Marker("Apsra", 10));
		
		System.out.println(a);
	}
}
