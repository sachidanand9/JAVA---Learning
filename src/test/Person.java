package test;

public class Person {
	private String name;
	private int age; 	

 
public  int getAge() {
	return age;
}
public  String getName() {
	return name;
}
public void setAge(int age) {
	this.age=age;
}
public void setName(String name) {
	this.name=name;
}
 
 class Person2 extends Person{
	 String name;
	 int age;
 }
public static void main(String[] args) {
	Person p1 = new Person();
	p1.setName("Rahul");
	p1.setAge(20);
	
	Person2 p2 = (Person2) new Person();
	p2.setName("RAvi");
	p2.setAge(22);
	
	System.out.println(p1.getName());
	System.out.println(p1.getAge());
	System.out.println(p2.getName());
	System.out.println(p2.getName());
	
	
	
	
//	System.out.println(name+" "+age);
}
}

