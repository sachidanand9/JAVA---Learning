package Programming;

import java.util.Scanner;

public class Digits_Number {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
 int n = sc.nextInt();
// int res = digits_Number(n);
 int r = countDigit(n);
 System.out.println("Count of digits is :" +r);
 
}
public static int countDigit(int n) {
	int count = 0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
}
