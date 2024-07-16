package int_prep;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first string");
	String a1 = sc.nextLine();
	
	System.out.println("Enter Second String");
	String a2 = sc.nextLine();
	
	if (a1.length()==a2.length()) {
		char[] c1 = a1.toCharArray();
		char[] c2 =a2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean isAnagram = Arrays.equals(c1, c2);
				System.out.println("Anagram :"+isAnagram);
	} else {
           System.out.println(" Not Anagram");
	}
}
}
