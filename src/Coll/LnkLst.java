package Coll;

import java.util.LinkedList;

public class LnkLst {
public static void main(String[] args) {
	LinkedList li = new LinkedList();
	
	li.add(4);
	li.add(5);
	li.add(6);
	
	System.out.println(li);
	
	li.add(1,10);
	
	System.out.println(li);
}
}
