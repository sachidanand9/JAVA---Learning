package Programming;

import java.util.Scanner;

public class RverseNumb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Numbers which you want to reverse :");
	int n = sc.nextInt();
	int rev =0,r;
	System.out.println("Rverse Number is :");
	while (n>0) {
		 r = n%10;
		 rev = rev*10+r;
		 n = n/10;
		 System.out.print(r);
	}
	System.out.print(rev);
}
}
