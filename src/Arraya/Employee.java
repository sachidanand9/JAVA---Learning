package Arraya;

import java.util.Iterator;

public class Employee {
    String name;
    int id;
    double sal;
    
    public Employee (String name, int id, double sal) {
    	this.name = name;
    	this.id = id;
    	this.sal = sal;
		}
    
    public String toString() {
    	return name +" "+ id + " "+ sal;
    }
    
    public static void main(String[] args) {
		Employee[]e = new Employee[3];
		e[0] = new Employee("Rahul",55 , 74550);
		e[1] = new Employee("JAs", 55, 74740);
		e[2] = new Employee("Pankaj", 80, 3450);
		
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		
		for(int i = 0; i<e.length;i++) {
			
			System.out.println(e[i]);
		}
		
	}
}
