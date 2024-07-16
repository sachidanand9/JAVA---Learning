package Scanner;

import java.util.Scanner;

public class Demo {
 public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println(" Enter name, age and sal :");
	
	String name = obj.nextLine();
	int age = obj.nextInt();
	double sal = obj.nextDouble();
	
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Salaray : "+sal);
}
}
