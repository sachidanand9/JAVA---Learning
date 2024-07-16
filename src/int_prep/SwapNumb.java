package int_prep;

import java.util.Scanner;

public class SwapNumb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First number  :");
	int a =sc.nextInt();
	System.out.println("Enter second number") ;
	int b = sc.nextInt();
	
//	System.out.println("Number A and B before swap :"+a+""+b);

	System.out.println(" Value of  A before swap : "+a);
	System.out.println(" Value of  B before swap : "+b);
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	System.out.println(" Value of  A after swap : "+a);
	System.out.println(" Value of  B after swap : "+b);
}
}
