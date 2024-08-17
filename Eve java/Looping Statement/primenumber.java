/*
Write a program to check whether the entered 
number is prime number or not.

Test Case 1: 
	Input : 7
	Output : true

Test Case 2: 
	Input : 15
	Output : false

*/

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        // read number
        int num = sc.nextInt();

        // count factors

        int count = 2; // 1& num itself is a factor

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        // ---> Check if it is prime
        if (count == 2) {
            System.out.println(" Number is prime");
        } else {
            System.out.println("It is a not prime ");
        }
    }
}
