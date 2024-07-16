package this_constructor;

public class human {
      String name;
      long phone;
      float id;
      
      public void initialize(String name, long phone, float id) {
		this.name = name;
		this.phone = phone;
		this.id = id;
	}
      public void print() {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(id);
	}
      public static void main(String[] args) {
		human h = new human();
		h.initialize("Raghu" ,536764664,  24.43f);
		h.print();
		
	}
}
