package Programming;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month :");
		
		int n = sc.nextInt();
		
		if (n>=1&&n<=12) {
			System.out.println("Entered month is valid");
		} else {
	       System.out.println("Entered month is invalid");
		}
	}
}
