/*

For an Ecommerce application we need to write a logic to calculate the total price of the purchase after applying the discount.The discount are as follows,
If the customer is a teenager, flat discount 5%. If the total purchase price is above 5000 after the flat discount customer gets additional 5% discount.
If the customer is in 20's flat discount 6%. If the total purchase price is above 4000 after the flat discount customer gets additional 6% discount.
If the customer is aged above 29 flat discount 15%. 
Assume the age and total purchase price is given as input.
Write a program to calculate the total price of purchase after discount and display, 
total price before discount,total price after discount,discounted amount if any.


*/

import java.util.Scanner;


public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age :");
        // Read input
        int age = sc.nextInt();

        System.out.println("Enter total price");
        double total_price = sc.nextDouble();
        double price_after_discount = 0.0;

        // lets apply discount

        if (age >= 13 && age <= 19) {
            // step1: appply 5% discount
            price_after_discount = total_price - (total_price * 0.05);
            // step2: apply another 5% if after discount price>500
            if (price_after_discount > 5000) {
                price_after_discount = price_after_discount - (price_after_discount * 0.05);
            } // end of inner-if
        } // end of outer-if
        else if (age >= 20 && age <= 29) {
            // step1 : apply flat discount 6%
            price_after_discount = total_price - (total_price * 0.06);

            // step2: check new price is greter than 4000
            if (price_after_discount > 4000) {
                price_after_discount = price_after_discount - (price_after_discount * 0.06);
            } // end of inner if
        } // end of outer esle if

        else if (age >= 29) {
            // step 1 : apply flat 15% discount
            price_after_discount = total_price - (total_price * .15);
        }

        // Display outpus 
        // 1 ---> Total Price
        System.out.println("Total price : "+total_price);

        // 2 ---> Total price after discount
        System.out.println("Price afetr discount : "+price_after_discount);

        
        // 3 ---> Discount Amount
        System.out.println("Discount Amount : "+(total_price - price_after_discount));
    }
}
