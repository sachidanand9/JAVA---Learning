package Programming;

import java.util.Iterator;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (prime(n)) {
			System.out.println("Prime Number :"+prime(n));
		} else {
			System.out.println("Not a prime Number");
		}
	}

	public static boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % 2 == 0)
				return false;
		}
		return true;
	}

}
