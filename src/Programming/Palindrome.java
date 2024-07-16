package Programming;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	System.out.println(palindrome(n));
}
public static boolean palindrome(int n) {
	int temp = n, rev = 0;
	
	while(n>0) {
		int r = n%10;
		rev = rev*10+r;
		n=n/10;
	}
	return temp ==rev;
	
}
}
