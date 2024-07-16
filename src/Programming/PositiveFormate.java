package Programming;

import java.util.Scanner;

public class PositiveFormate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int n = sc.nextInt();
	if (n<0) {
		n = n*-1;
		System.out.println(" Convert to Positive number"+n);
		
	}
	else{
		System.out.println(n+" :Not converted to positive number bcz you entered already positive integer");
	}
}
}
