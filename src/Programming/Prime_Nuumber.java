package Programming;

import java.util.Scanner;

public class Prime_Nuumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		printPrime(n);
	}
	public static void printPrime(int n ) {
		for(int i=2;i<n;i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
		}
	public static boolean isPrime(int n) {
		for(int i = 2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
