package Programming;

import java.util.Scanner;

public class SpecialDigit {
	
	public static void special(int n) {
		int l=n%10;
		int f = n/10;
		int res =(l+f)+(l*f);
		
		if (n==res) {
			System.out.println("Special two digit numbwer :" +res);
		} else {
            System.out.println("Not a special two digit number :" +res);
		}
		
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	
	special(n);
}
}
