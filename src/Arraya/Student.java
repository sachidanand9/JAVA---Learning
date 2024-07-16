package Arraya;

public class Student {
String name;
int id;

public Student( String name, int id) {
	this.name = name;
	this.id = id;
}

public static void main(String[] args) {
	Student[] s= new Student[3];
	Student s1 = new Student("hary", 6);
	Student s2 = new Student("Subh", 34);
	Student s3 = new Student("Stan", 1);
	
	s[0]=s1;
	s[1]=s2;
	s[2]=s3;
	
	System.out.println(s[0].name);
	System.out.println(s[0].id);
	System.out.println(s[1].name);
	System.out.println(s[1].id);
	System.out.println(s[2].name);
	System.out.println(s[2].id);
	
}
	 
}
