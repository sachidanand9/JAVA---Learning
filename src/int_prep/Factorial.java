package int_prep;

import java.util.Iterator;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a no :");
	 int n = sc.nextInt();
	 
	 int fac = 1;
	 
	 for(int i = 1; i<=n; i++) {
		 fac*=i;
	 }
	 System.out.println("Fcatorila of "+n+" is :"+fac);
}
}
