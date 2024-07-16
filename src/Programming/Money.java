package Programming;

import java.util.Scanner;

public class Money {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amount :");
	
	long m = sc.nextLong();
//  m = m%2000;
  System.out.println(2000+"->"+m/2000);
  m = m%2000;
  System.out.println(500+"->"+m/500);
  m = m%500;
  System.out.println(200+"->"+m/200);
  m = m%200;
  System.out.println(100+"->"+m/100);
  m = m%100;
  System.out.println(50+"->"+m/50);
  m = m%50;
  System.out.println(20+"->"+m/20);
  m = m%20;
  System.out.println(10+"->"+m/10);
  m = m%10;
  System.out.println(5+"->"+m/5);
  m = m%5;
  System.out.println(2+"->"+m/2);
  m = m%2;
  System.out.println(1+"->"+m/1);
  m=m%1;
}
}
