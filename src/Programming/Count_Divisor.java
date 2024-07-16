package Programming;

import java.util.Scanner;

public class Count_Divisor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	System.out.println(countdivisors(n));
}
public static int countdivisors(int n) {
	int count = 0;
	for(int i = 1; i<=n;i++) {
		if(n%i==0)
			count++;
	}
	return count;
}
	
}
