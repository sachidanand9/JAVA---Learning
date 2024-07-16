package int_prep;

import java.util.Scanner;

public class Disarium_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
	 System.out.println(check(n)?"Disarium number":"Not a Disarium number");
	}
	public static boolean check(int n) {
		int cd = Integer.toString(n).length();
		
		int sum = 0,x=n;
		while(x!=0) {
			int r = x%10;
			sum = (int)(sum+Math.pow(r, cd--));
			x=x/10;
		}
		return (sum==n);
	}
}
