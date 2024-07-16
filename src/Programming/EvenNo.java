package Programming;

import java.util.Scanner;

public class EvenNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	
	switch(n%2) {
	case 0:
		System.out.println("Even");
		break;
		
	case 1:
		System.out.println("odd");
		
	}
}
}
