package String;

import java.util.Scanner;

public class countChar {
	public static void charCount(String st) {
		int uc = 0, lc = 0, sp = 0, d = 0;

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				uc++;
			} else if (ch >= 'a' && ch <= 'z') {
				lc++;
			} else if (ch >= '0' && ch <= '9') {
				d++;
			} else {
				sp++;
			}
		}
		System.out.println("Upper Case"+uc);
		System.out.println("Lower Case"+lc);
		System.out.println("Digits"+d);
		System.out.println("Special Character"+sp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		charCount(sc.next());
	}
}
