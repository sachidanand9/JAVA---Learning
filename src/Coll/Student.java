package Coll;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	public Student(int id,String name) 
	{
		this  .id = id;
	this.name = name;
	}
	public String toString() {
		return "Student[id="+id+",name =" +name +"}";
	}
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student(1 ,"XYZ"));
		al.add(new Student(2 ,"ABC"));
		al.add(new Employee(3, " lmo ",  500 ));
		for(Object o : al )
		{System.out.println(o);
		
		
	}
	}
}
