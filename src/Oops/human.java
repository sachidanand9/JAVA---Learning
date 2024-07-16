package Oops;
                 // --------> Encapsulation <--------------
public class human {
     private int age;
     private String name;
     
     public int  getAge() {
		return age;
	}
     public void setAge(int a)
     {
    	 age  = a;
     }
     public String getName() {
    	 return name;
     }
     public void setName(String n)
     {
    	name = n;
     }
//     public static void main(String[] args) {
// 		human h1 = new human();
//// 		human h2 = new human();
// 		int a;
// 		h1.setAge(50); 
// 		String n;
// 		h1.setName("REddy");
// 		
// 		System.out.println(h1.getAge()+" "+ h1.getName());
// 	}
  
}
