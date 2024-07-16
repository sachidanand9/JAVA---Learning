package Programming;

import java.util.Scanner;

public class User_Input {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Something");
	
	char ch = sc.next().charAt(0);
	
	if (ch >= 'A' && ch<= 'Z' || ch>='a' && ch<='z' ) {
		System.out.println("you enterd a Character");
	} else if(ch>='0'&&ch<='9'){
       System.out.println("Digit");
	}
	else {
		System.out.println("Special Character");
	}
}
}
