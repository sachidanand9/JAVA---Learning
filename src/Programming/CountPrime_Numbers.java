package Programming;

import java.util.Scanner;

public class CountPrime_Numbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
	int n = sc.nextInt();
  int count = contDigit(n);
		  System.out.println("Count of prime number :"+count);
}
public static int contDigit (int n) {
	int count = 0;
	while (n>0) {
//		count ++;
		int r=n%10;
		if(prime(r)) {
			count ++;
		}
		n/=10;
		
	}
	return count;
}

public static boolean prime(int n) {
	for(int i = 2;i<=n/2;i++) {
		if(n%2==0)
			return false;
	}
	return true;
}
}
