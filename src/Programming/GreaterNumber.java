package Programming;

import java.util.Scanner;

public class GreaterNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 3 number :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int big = a>b?a:b;
	
	big = big>c?big:c;
	
	
//	----------> OR <-----------------
//	int big = a;
//	if (big<b) {
//		big = b;
//		
//	} 
//	if(big<c){
//		big = c;
//
//	}
	
	System.out.println("Biggest number is :"+big);
}
}
