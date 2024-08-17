/*
 * Write a method to return the largest element in the given 
 * integer array
   */

public class largest_element_array {
    public static void main(String[] args) {
        int[] num = {5,8,9,23,-45};
        System.out.println(largest(num));
    }

    public static int largest(int[] array){
        int largest = array[0];

        for(int i = 1; i<array.length; i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }
        return largest;
    }
}
