package Scanner;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Age :");
	
	int Age = sc.nextInt();
	if (Age>18) {
		System.out.println("You can drive");
	}
	if (Age>100) {
		System.out.println("Invalid age input");
	}
	else if (Age==18) {
		System.out.println("You can drive but only scooty with the healp of learning license");
		
	}
	else {
		System.out.println("You can not drive ");
	}
}
}
