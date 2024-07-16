// Write a program to check given string is palindrome or not ?

package String;

import java.util.Scanner;

public class palindrome1 {

	public static boolean palindrome(String str) {
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;

			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		
		if (palindrome(sc.nextLine())) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a Palindrome");

		}

	}
}
