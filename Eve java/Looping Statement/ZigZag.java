/*
 * We have a concept called a "Zigzag Number." 
A Zig-zag Number is formed by interleaving the digits of two 
equal-length input numbers.
Given two input numbers, determine the Zigzag Number and print 
the output
Explanation:
The candidate should recognize the interleaving pattern:
Take the first digit from the first input number.
Take the last digit from the second input number.
Continue this process alternately until all digits from both 
numbers are used.
This explanation demonstrates their understanding of the 
interleaving process used to form a Zigzag Number.

Test Case 1: 

	Input 1 : 927
	Input 2 : 613
	Output : 932176

Test Case 2: 

	Input 1 : 514
	Input 2 : 706
	Output : 561047

Test Case 3: 

	Input 1 : 32
	Input 2 : 190
	Output : Invalid

 */

import java.util.Scanner;

public class ZigZag {

    public static int length(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // method for reverse number

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take 1st input from user
        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();

        // Take 2nd input from user
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();

        // find the length validation for zigzag

        if (length(num1) == length(num2)) {
            // To finding Zigzag

            // step1 : reverse num1
            int reverse_of_num1 = reverse(num1);

            int zigzag = 0;
            while (reverse_of_num1 != 0) {

                // extract from rev_of_num1
                int d = reverse_of_num1 % 10;

                zigzag = zigzag * 10 + d;

                // extract from num2;
                d = num2 % 10;
                zigzag = zigzag * 10 + d;

                // Update
                reverse_of_num1 = reverse_of_num1 / 10;
                num2 = num2 / 10;
            }
            System.out.println(zigzag);
        } else {
            // length not same
            System.err.println("Invalid, because length of both input is diffrent ");
        }
    }
}
