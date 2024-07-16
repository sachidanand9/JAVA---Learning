package Programming;

import java.util.Scanner;

public class Count_Digit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	
	int n = sc.nextInt();
	
	if (n>=-9&&n<=9) {
		System.out.println("Entered Number is  Digit");
	} else {
       System.out.println("Entered Number is a Number");
	}
}
}
