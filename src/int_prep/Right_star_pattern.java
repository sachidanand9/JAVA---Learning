package int_prep;

import java.util.Scanner;

public class Right_star_pattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rows :");
	int row = sc.nextInt();
	int i,j;
	
	for(i=1;i<=row;i++) {
		
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
