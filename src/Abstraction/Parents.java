package Abstraction;

abstract class Parents {
	public abstract void m1();
}
class child extends Parents{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}


 public static void main(String[] args) {
	 Parents p = new child();
	 p.m1();	 
	
	 child c = new child();
	 c.m1();
	 c.m2();
	 
 }
 }