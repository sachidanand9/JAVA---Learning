package int_prep;

import java.util.Scanner;

public class number_reverse_triangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n = sc.nextInt();
		int i, j;
		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {
			}
			System.out.print(" ");
			for (j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
