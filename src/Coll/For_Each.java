package Coll;

import java.util.ArrayList;

public class For_Each {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(11);
	al.add(12);
	al.add(14);
	
	for(Object o:al) {
		System.out.println(o);
	}
}
}
