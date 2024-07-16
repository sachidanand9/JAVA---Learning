package Abstraction;

public class C1 implements I1 {
	
	public void m1() {
		System.out.println("Override");
	}
	public static void main(String[] args) {
		C1 c = new C1();
		c.m1();
		
		I1 i = new C1();
		i.m1();
	}
	

}
