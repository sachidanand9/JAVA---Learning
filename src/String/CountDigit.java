package String;

import java.util.Scanner;

public class CountDigit {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = sc.next();
	
	char[] ch = str.toCharArray();
	int d = 0;
	for(int i = 0; i<ch.length;i++) {
		if (ch[i]>='0' && ch[i]<='9') {
			d++;
		}
	}
	System.out.println("Count of digits "+d);
}
}
