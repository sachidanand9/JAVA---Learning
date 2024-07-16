package int_prep;

import java.util.Scanner;

public class Right_down_star_pattren {
public static void main(String[] args) {
	Scanner ac = new Scanner(System.in);
	System.out.println("Enter no of rows");
	int n = ac.nextInt();
	int i,j;
	
	for(i=n;i>=1;i--) {
		
		for(j=n;j>i;j--) {
			System.out.print(" ");
			
		}
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
