package int_prep;

import java.util.Scanner;

public class MagicalNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a nummber");
		int n = sc.nextInt();
		int sum = 0;
		
		while (n>0 || sum >9) {
			if (n ==0) {
				n = sum;
				sum = 0;
			}
			sum = sum+n%10;
			n = n/10;
		}
		if (sum ==1) {
			System.out.println("Magic number");
		} else {
             System.out.println("Not a magic number");
		}
	}
}
