// Write a java program to print the factorila of the given number

import java.util.Scanner;

public class factorial {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  number");
    int numb = sc.nextInt();
    int i,fact=1;
    for(i=1 ; i<=numb ; i++){
            fact = fact*i;
    }
    System.out.println("Factorial of "+numb+" is : "+fact);
   } 
}
