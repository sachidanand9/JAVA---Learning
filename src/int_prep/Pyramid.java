package int_prep;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n = ac.nextInt();
		int i,j;
		
		for(i=0;i<n;i++) {
			
			for(j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
