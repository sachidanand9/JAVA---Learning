package Oops;

public class driver {
	public static void main(String[] args) {
		human h1 = new human();
		human h2 = new human();
		int a;
		h1.setAge(30); 
		String n;
		h2.setName("REddy");
		
		System.out.println(h1.getAge()+" "+ h2.getName());
	}
}
