package Encapsulation;

public class Person {
       private String name;
       private int age;
       
       public String getName() {
       return name;
       }
       
       public void setName(String name) {
         this.name = name;
       }
       
       public int getAge() {
    	   return age;
       }
       public void setAge(int age) {
    	   this.age = age;
       }
 
	public static void main(String[] args) {
		Person P = new Person();
		P.setName("Rohan");
		P.setAge(19);
	    System.out.println(P.getName());	
	    System.out.println(P.getAge());	
		}
}

