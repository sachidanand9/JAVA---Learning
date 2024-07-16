package Programming;

import java.util.Scanner;

public class Digit_sum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	
	int n = sc.nextInt();
	int sum=0,r;
	while(n!=0) {
	r = n%10;
	sum = sum+r;
	n = n/10;
	}
	System.out.println("Sum of numbers is : "+sum);
}
}
