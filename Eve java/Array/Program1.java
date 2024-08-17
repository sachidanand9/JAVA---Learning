/*
 *  To create an Array 
 * 
 *  case 1: create array using declare & initialization stmt
 *  case 2: create an array using new without initialization
 *  case 3: create an array using new & initialization 
 *   
 */

// package Array;

public class Program1 {
    public static void main(String[] args) {
        // Creating and initialize Array
        int[] a = {10, 20, 30};
        // priniting array ref
        System.out.println(a);

         // use loop 
        // initialzation  ----> index 
        // condition to stop --> index == length stop 
        //                        index < length continue 

        for(int index = 0; index<a.length;index++){
             System.out.print(a[index]);
        }
    }
}
