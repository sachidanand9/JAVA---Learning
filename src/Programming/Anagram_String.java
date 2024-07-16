package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Taking first String
	System.out.println("Enter First String :");
	String str1 = sc.nextLine();
	
	// Taking second String
	System.out.println("Enter Second String :");
	String str2 = sc.nextLine();
	
	if (Anagram(str1,str2)) {
		System.out.println(str1 + " and " + str2 + " are anagrams.");
	} else {
System.out.println(str1 + " and " + str2 + " are not anagrams.");
	}
	
}
public static boolean Anagram(String str1, String str2) {
	if(str1.length() != str2.length()) {
		return false;
	}
	
	char[] Arr1 = str1.toLowerCase().toCharArray();
	char[] Arr2 = str2.toLowerCase().toCharArray();
	
	// Sorting Array 
	Arrays.sort(Arr1);
	Arrays.sort(Arr2);
	
	return Arrays.equals(Arr1, Arr2);
}
}
