package Programming;

import java.util.Scanner;

public class EvenNumb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number ");
	int n = sc.nextInt();
	int r ;
	while(n!=0) {
		r = n%10;
		if(r%2==0) {
//			System.out.println("Even numbers are :"+r);
			System.out.println(r);
		}
		n= n/10;
//		System.out.println();
	}
}
}
