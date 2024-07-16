package Programming;

import java.util.Scanner;

public class Armagstrong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int temp = n,sum=0,r;
	
	while (n>0) {
		r = n%10;
		sum = sum+r*r*r;
		n = n/10;
	}
	if(temp==sum) {
		System.out.println("Armstrong number : "+temp);
	}
	else {
		System.out.println("Not a Armstrong : "+temp);
	}
}
}
