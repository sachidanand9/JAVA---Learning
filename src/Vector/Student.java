package Vector;

import java.util.Objects;

public class Student {
 int id ;
 String name;
  
 public Student(int id, String name) {
	 this.id = id;
	 this.name = name;
 }
 
 public boolean equals(Object o) {
	 Student s = (Student) o;
	 if (this.name == s.name) {
		 return true;
	}
	 else {
		 return false;
	 }
	 }
 
 public int hashCode() {
	 return Objects.hash(name);
 }
 
  public String toString() {
	  return "id ="+id+" name = "+name;
  }
 }

