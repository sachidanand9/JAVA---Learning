package int_prep;

import java.util.Scanner;

public class left_star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int n = sc.nextInt();
		int i, j;

		for (i = n; i >= 1; i--) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for(j=0; j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
