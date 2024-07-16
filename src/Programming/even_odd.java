package Programming;

import java.util.Scanner;

public class even_odd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");

	int n = sc.nextInt();
	int ec=0,oc=0,r;
	
	while (n>0) {
		r = n%10;
		if (r%2==0) {
			ec++;
		} else {
            oc++;
		}
		n = n/10;
	}
	System.out.println("Even Count :"+ec);
	System.out.println("Odd Count :"+oc);
}
}
