package Coll;

public class Marker {
	String brand;
	int price;
	
	public Marker(String brand, int price) {
		
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Marker [brand=" + brand + ", price=" + price + "]";
	}
	
	

}
