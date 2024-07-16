package Coll;

import java.util.ArrayList;
import java.util.Collections;

public class Car {
  String name;
  int carID;
  String color;
  
  public Car (String name, int carID, String color) {
	  this.name = name;
	  this.carID = carID;
	  this.color = color;
  }
  
  public String toString() {
	  return name+" "+carID+" "+color;
  }
  
  public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(new Car("Zen", 234 ,"Red"));
	al.add(new Car("Audi",320,"Black"));
	al.add(new Car("Supra",420,"Yellow"));
	Collections.sort(al, new SortByCarName());
	for(Object o : al) {
		System.out.println(o);
	}
//	Collections.sort(al, new SortById());
//	for(Object o : al) {
//		System.out.println(o);
//	}
	
}
  
  
}
