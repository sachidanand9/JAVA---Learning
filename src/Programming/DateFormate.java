package Programming;

import java.util.Scanner;

public class DateFormate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Day");
	int d = sc.nextInt();
	System.out.println("Enter Month");
	int m = sc.nextInt();
	System.out.println("Enter Year");
	int y = sc.nextInt();
	
	if (d<1 || m<1 || y<1 || d>31 || m>12) {
		System.out.println(" Invalid Input ");
	}
	else if(m==4 || m==6 || m==9 || m==11 && d>30) {
		System.out.println("Invalid Input ");
	}
	
	else if (m==2 && d>29) {
		System.out.println("Invalid Input");
	}
	else if ((y%4==0 && y%100!=0 || y%400==0)==false && m ==2 && d>29 ){
		System.out.println("Invalid Input");
	}
	else{
		System.out.println("Valid Input");
	}
}
}
