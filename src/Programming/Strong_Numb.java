package Programming;

import java.util.Scanner;

public class Strong_Numb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	
	System.out.println(strong(n));
}
public static int fact(int n) {
	int f = 1;
	while(n>0) {
		f=f*n;
		
		n--;
	}
	return f;
}
public static String strong(int n) {
	int sum = 0,temp = n,r;
	
	while(n>0) {
		r = n%10;
		sum = sum +fact(r);
		n=n/10;
	}
	if(temp==sum) {
		return "Strong Number";
	}
	else {
	return "Not Strong";
	}
}
}
