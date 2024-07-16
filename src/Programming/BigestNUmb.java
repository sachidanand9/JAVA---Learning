package Programming;

import java.util.Scanner;

public class BigestNUmb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter numbers");
	int n = sc.nextInt();
	System.out.println(biggestDigit(n));
}
public static int biggestDigit(int n) {
	int big = -9;
	do {
		int r = n%10;
		if(big <r) {
			big = r;
		}
		n = n/10;
	} while (n>0);
	
	return big;
}
}
