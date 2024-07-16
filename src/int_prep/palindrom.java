package int_prep;

import java.util.Scanner;

public class palindrom {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter A number ");
	int n =s.nextInt();
	
	int r, sum = 0;
	int temp;
	temp =n;
	
	while (n>0) {
		r=n%10;
		sum =(sum*10)+r;
		n=n/10;
	}
	if (temp==sum) {
		System.out.println("Palindroe number :"+sum);
	}
	else{
		System.out.println("Not a palindrom number :"+sum);
	}
}
}
