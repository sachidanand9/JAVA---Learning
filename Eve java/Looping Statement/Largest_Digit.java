/*
* Write a Java program to find the largest digit  in the given series of number.

Description :
Input : 12321
Output : 3

 */

import java.util.Scanner;

public class Largest_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers");
        int num = sc.nextInt();

        // Assumption
        int largest_digit = num%10;
        num  = num/10;

        // check if the assumption is correct for remaninig digits?
        while (num!=0) {
            int digit = num%10;
        
            // check wheter assumption is correct
        if (digit>largest_digit) {

            //assumption was wrong change largest digit
            largest_digit=digit;
        }
        // update
        num = num/10;
    }
    System.out.println("Largest digit in the given number is : "+largest_digit);
    }
}
