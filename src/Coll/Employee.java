package Coll;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Employee {

	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;

	}

	public String toString() {
		return id + "" + name + "" + sal;

	}
	
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(new Employee(4, "lmp", 99));
		al.add(new Employee(3, "xyz", 88));
		al.add(new Employee(1, "abc", 90));
		
		Collections.sort(al, new SortByName());
		for(Object o : al) {
			System.out.println(o);
		}
		Collections.sort(al, new SortById());
		for(Object o : al) {
			System.out.println(o);
		}
		
		
	}
}
