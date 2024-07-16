package Abstraction;

public class JuniorRahul extends Rahul{
	public void homeLoan() {
		System.out.println("home loan is paid");
	}
	
	public static void main(String[] args) {
		JuniorRahul jr = new JuniorRahul();
		jr.goldLoan();
		jr.homeLoan();
		Parent p  = new JuniorRahul();
	    p.getClass();
	    p.homeLoan();
	    
	}

}
