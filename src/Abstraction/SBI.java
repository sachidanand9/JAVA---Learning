package Abstraction;

public class SBI implements Bank {
	@Override
	public void withDraw() {
		System.out.println("500000");
	}
	@Override
	public void deposit() {
		System.out.println("1000000");
		
	}

 @Override
public void balance() {
	System.out.println("124356498709");
	
}
 public static void main(String[] args) {
	SBI s= new SBI();
	s.withDraw();
	s.balance();
	s.deposit();
	
	Bank b = new SBI();
	b.balance();
	b.deposit();
	b.withDraw();
	
}

}
 
