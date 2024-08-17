/*
Write a program to find the factors for a given natural numbers.
Test Case 1: 
	Input : 9
	Output : 1,3,9

Test Case 2: 
	Input : 15 
	Output : 1,3,5,15
*/

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  number");
    int numb = sc.nextInt();
    int count = 0;
    // System.out.print(1+ ", ");
    for (int i = 2; i<=numb ; i++) {
        if(numb%i ==0){
            System.out.print(i +",");
            count++;
        }
    }
    System.out.println("The factor of "+numb+" is :- ");
    System.out.println(count);
    }
}
