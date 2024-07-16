package test;

 class JuniorChild extends Child{
	public void homeLoan() {
		System.out.println("Home loan is paid");

	}

	public static void main(String[] args) {
		JuniorChild ch = new JuniorChild();
		ch.goldLoan();
		ch.homeLoan();
		 
	    
	}
}
