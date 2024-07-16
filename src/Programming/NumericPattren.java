package Programming;

import java.util.Scanner;

public class NumericPattren {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int x = 1;
	
	for(int i = 1;i<=n;i++) {
		
		for(int j = 1;j<=n-i;j++) {
			System.out.print(" ");
		}
		
		for(int j =1;j<=i;j++) {
			System.out.print(x%2);
			x++;
		}
		System.out.println();
	}
}
}
