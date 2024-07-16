package Variables;
                 // --------- STATIC BLOCK --------
public class car {
    String brand;
    String color;
    public void printcar() {
    	System.out.println(brand);
    	System.out.println(color);
    }
    public static void main(String[] args) {
		car c1 = new car();
		c1.brand = "Audi";
		c1.color = "Black";
		
		c1.printcar();
	}
    
    
}
