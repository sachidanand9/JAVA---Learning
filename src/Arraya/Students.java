package Arraya;

public class Students {
public static void main(String[] args) {
	String s1 = new String("hello");
	String s2 = new String("hello");
	String s3 = "hello";
	String s4 = "hello";
	
	System.out.println(s1 == s2);  
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s3==s4);
	
}
}
