package Variables;

public class ca_r {
	String brand;
	String color;

	private void initialize( String b, String c) {
		brand = b;
		color = c;
		
	}
	private void printcar() {
		System.out.println(brand +":"+ color);
	
	}
	
	public static void main(String[] args) {
		ca_r c1 = new ca_r();
//		c1.brand = "Ford";
//		c1.color = "Red";
		
		c1.initialize("ford", "red");
		c1.printcar();
	}

}
