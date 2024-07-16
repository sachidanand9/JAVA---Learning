package Programming;

import java.util.Scanner;

public class Marks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Marks");
	
	int sub1 = sc.nextInt();
	int sub2 = sc.nextInt();
	int sub3 = sc.nextInt();
	int sub4 = sc.nextInt();
	
	if (sub1<33 || sub2<33 || sub3<33 || sub4<33) {
		System.out.println(" You are Fail ");
	} 
	else {
int avg = (sub1+sub2+sub3+sub4)/4;

if(avg>85) {
	System.out.println("Distinct");
}
else if (avg>=75) {
	System.out.println("First class Pass");
}
else if(avg>=50) {
	System.out.println("second class Pass");
}
else {
	System.out.println("just Pass");
}
	}
}
}
