import java.io.InputStream;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in); 
		 System.out.println("Enter Your name");
		 String name = sc.next();
		 System.out.println("Enter your Age");
		 int age = sc.nextInt();
		 System.out.println("Enter Phone number");
		 long phone = sc.nextLong();
		 System.out.println("Enter Your Weight");
		 float Weight= sc.nextFloat();
		 
		 System.out.println("-----Your Deatils-----");
		 System.out.println("Name :"+name);
		 System.out.println("Age :"+age);
		 System.out.println("Phone Number :"+phone);
		 System.out.println("Weight :"+Weight);
		 
	}
	

}
