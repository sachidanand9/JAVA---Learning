package Programming;

import java.util.Scanner;

public class Disarium_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number n");
		int n = sc.nextInt();
		System.out.println("Enter a number p:");
		int p = sc.nextInt();
//	System.out.println("Enter a number p");

		int sum = 0, temp = n, r;
		int c = count(n);

		while (n > 0) {
			r = n % 10;
			sum = sum + power(r, c);
			n=n/10;
			c--;
		}
		if (temp == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}

	}

	public static int power(int n, int p) {
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}

	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}

