package Programming;

import java.util.Scanner;

public class mailbox_star {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter row ");
	int n = sc.nextInt();
	int i ,j;
	
	for(i = 1; i<=n; i++) {
		
		for(j = 1; j<=n; j++) {
			
			if(i==1 || j==1 || j==n || i==n || i==j || i+j==n+1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
