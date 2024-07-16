package Vector;
import java.util.Objects;

public class Student2 implements Comparable{
 
	 int id ;
	 String name;
	  
	 public Student2(int id, String name) {
		 this.id = id;
		 this.name = name;
	 }
	 
//	 public boolean equals(Object o) {
//		 Student2 s = (Student2) o;
//		 if (this.name == s.name) {
//			 return true;
//		}
//		 else {
//			 return false;
//		 }
//		 }
//	 
//	 public int hashCode() {
//		 return Objects.hash(name);
//	 }
	 
	  public String toString() {
		  return "id ="+id+" name = "+name;
	  }

	@Override
	public int compareTo(Object o) {
		Student2 s =  (Student2) o;
		
		if (this.id>s.id) {
			return 5;
		}
		else {
		return 0;
		}
	}
	 }



