package Programming;

import java.util.Scanner;

public class SortNumb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three number :");
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int big = (a<b&&a>c)?a:(b>c)?b:c;
	
	System.out.println(big);
	
	int small = (a<b&&a<c)?a:(b<c)?b:c;
	
	System.out.println(small);
	
	int mid = (a+b+c)-(big+small);
	
	System.out.println(mid);
}
}
