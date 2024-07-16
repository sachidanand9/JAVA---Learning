//print the frequency of each character in string?

package String;

import java.util.Scanner;

public class freqency_char {
	
	public static void frequency(String str) {
		
		char[] ch = str.toCharArray();
		int[] count = new int [126];
		
		for(int i = 0; i<ch.length;i++) {
			count[ch[i]]++;
		}
		
		for(int i = 0; i<count.length;i++) {
			if(count[i] != 0) {
				System.out.println((char) (i)+ "->" + count[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a String");
		frequency(sc.nextLine());
	}
}
