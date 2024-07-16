package Programming;

import java.util.Scanner;

public class power_of_n {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number n:");
	int n = sc.nextInt();
	System.out.println("Enter a power p:");
	int p = sc.nextInt();
	
	System.out.println(power(n,p));
}
public static int power (int n, int p) {
	int res = 1;
	for(int i = 1;i<=p;i++) {
		res = res*n;
	}
	return res;
}
}
