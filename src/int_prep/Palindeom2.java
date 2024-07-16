package int_prep;

//import java.util.Iterator;
import java.util.Scanner;

public class Palindeom2 {
public static void main(String[] args) {
	String orignal,reverse="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String/number to check if it is a palindrom");
	orignal = sc.nextLine();
	int length = orignal.length();
	
	for(int i =length-1;1>=0;i--) {
		
		reverse = reverse+orignal.charAt(i);
		
		if (orignal.equals(reverse)) {
			
			System.out.println("Entered String/number is a palindrom"+reverse);
			
		} else {
           
			System.out.println(" Entered String/number is Not a palindrom");
		}
	}
	
}
}
