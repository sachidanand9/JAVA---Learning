package int_prep;

import java.util.Scanner;

public class ReverseStr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String st = sc.nextLine();
	String rstr = "";
	char ch;
	
   for(int i = 0; i<st.length();i++) {
	ch = st.charAt(i);
	rstr = ch+rstr;
}
   System.out.println("Reverse String : "+rstr);
}
}
