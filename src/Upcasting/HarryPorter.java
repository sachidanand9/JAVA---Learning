package Upcasting;





public class HarryPorter extends Student{
	public HarryPorter(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	
	public static void main(String[] args) {
		HarryPorter hp = new HarryPorter("harry",12);
		// up casting
		Student s = hp;
		System.out.println(s.name);
		System.out.println(s.id);
		// up casting 
		Student s2 = hp;
		System.out.println();
		System.out.println();
	}

}

