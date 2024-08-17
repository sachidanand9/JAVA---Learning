/*
    Write a method to return the count of even elements  
    in the given integer array

    Test Case 1: 

	Input :[1,6,9,0,25,16]
	Output : 3

    Test Case 2: 

	Input : [ 4, 78, 98, 87, 120 ]
	Output : 4

    Test Case 3: 

	Input : [ 5, -24, 47,- 21 ,58]
	Output : 1


 */

public class Even_Count {

    public static int evenCount(int[] array){
        int count = 0;

        for( int i = 0 ; i <array.length; i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5};

        System.out.println(evenCount(a));
    }
}
