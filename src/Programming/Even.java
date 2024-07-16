package Programming;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		 String[] a = {"even", "odd"};
		 System.out.println(a[n%2]);
		 a[0]= "Even";
		 a[1]="odd";
	}
}
