package Programming;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
	 System.out.println("Sum of digits is :"+getSum(n));
	}
	public static int getSum(int n) {
		int sum = 0;
		 while(n!=0) {
			 sum = sum+n%10;
				n=n/10;
		 }
		return sum;
	}
}
