package Arraya;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Size of Array");
	int[] arr = new int [sc.nextInt()];
	
	System.out.println("enter" + arr.length + "elements");
	for(int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	int res = sumOfInt(arr);
	System.out.println("Sum is :"+ res);
}
public static int sumOfInt(int[] arr) {
	int sum =0;
	
	for(int i =0; i<arr.length; i++) {
		sum = sum + arr[i];
	}
	return sum;
}
}
