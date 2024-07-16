package Programming;

import java.util.Scanner;

public class Digit_Sum1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
	 System.out.println("Avg Sum of digits is :"+avgSum(n));
	}
	public static int avgSum(int n) {
		int sum = 0 ,c=0;
		 while(n>0) {
			 int r = n%10;
			 sum = sum+r;
			 c++;
				n=n/10;
		 }
		return sum/c;
	}
}
