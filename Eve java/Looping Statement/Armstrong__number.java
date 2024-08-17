/*
 * 
You are developing a math learning application that includes a 
feature to help students identify and understand special numbers.

A special number is defined as a positive integer with m digits, 
that equals the sum of its digits, each raised to the power of m.
To determine if a number is special:
Calculate the number of digits m.
Compute the sum of each digit raised to the power of m.
Check if this sum equals the original number.

Explanation:

Number: 153

It has 3 digits (m=3)

Sum of Digits Raised to the Power of m:
=1^3+5^3+3^3
=1+125+27=>153
=153=153

 */

import java.util.Scanner;

public class Armstrong__number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter a number");
        int num = sc.nextInt();
        // step 2: preserve orignal
        int org_num = num;
        // step 3: find m(length o fnum)

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        int m = count;
        // step 4: calculate sum
        num = org_num;
        int sum = 0;
        while (num!=0) {
            // obtain d
            int d = num%10;
            // calculate d^m
            int power = 1;
            for(int i = 1; i<=m; i++){
                power = power*d;
            }
            sum = sum+power;

            num = num/10;
        }
        // step 5: compare sum with orignal num
        if (org_num==sum) {
            System.out.println(" It is special");
        }
        else{
            System.out.println("It is not special");
        }
    }
}
