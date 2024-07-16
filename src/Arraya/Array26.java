package Arraya;

import java.util.Scanner;

public class Array26 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Size of Array");
	int[] arr = new int [sc.nextInt()];
	
	System.out.println("enter" + arr.length + "elements");
	for(int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("your elements are");
	for(int i = 0;i<arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
