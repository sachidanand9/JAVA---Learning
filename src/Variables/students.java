package Variables;

public class students {
	String name;
	int age;
	int id;
	
	public static void main(String[] args) {
		students s1 = new students();
		s1.name = "Raj";
		s1.age = 23;
		s1.id = 2345;
		
		System.out.println( s1.name + s1.age + s1.id);
	}
	

}
