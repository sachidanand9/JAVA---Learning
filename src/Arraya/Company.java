package Arraya;

public class Company {
      String name;
      String location;
      int id;

      public Company(String name, String location, int id) {
		this.name = name;
		this.location = location;
		this.id = id;
	}
      public String toString() {
    	  return name+ " "+ location +" "+ id;
    	  
  	  }
      public static void main(String[] args) {
		Company[] c = new Company[3];
		c[0] = new Company("WEBLic", "Noida", 420);
		c[1] = new Company("litech", "DELHI", 6758);
	}
}
