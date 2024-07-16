package String;

import java.util.Scanner;

public class UppertoLOwer {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	
	String st = sc.next();
	System.out.println(lowercase(st));
	}
public static String lowercase(String st) {
	char[] ch = st.toCharArray();
	
	for(int i = 0; i<ch.length; i++) {
		if(ch[i] >= 'A' && ch[i]<= 'Z') {
			ch[i] = (char)(ch[i] +32);
		}
	}
	
	String res = new String(ch);
	return res;
	
}
}
