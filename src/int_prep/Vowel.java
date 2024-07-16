package int_prep;

import java.util.Scanner;

public class Vowel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String s = sc.nextLine();
	boolean hasVowel = hasVowel(s);
	if (hasVowel) {
		System.out.println("The string contains a vowel");
	} else {
      System.out.println("The string does not contain a vowel");
	}
}
public static boolean hasVowel(String s) {
	s = s.toLowerCase();   // Convert to lowercase for case-insensitive check
	for(char c : s.toCharArray()) {
		if (c =='a' || c=='e' || c == 'i' || c == 'o' || c=='u') {
			return true;
		}
	}
	return false;
}

}
