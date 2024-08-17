public class Unique_element {
public static int[] removeDuplicate(int[] array){
    int[] newArray = new int[array.length];
// s2 : copy first element
    newArray[0] = array[0];
    // s3:
    int k = 1;
    for(int i = 1; i<array.length; i++){
        // s4.1 check if the element is present in new array
int j = 0;
        for( j = 0; j<k; j++){
            if(array[i]==newArray[j]){
                break;
            }
        }
        if (j == k) {
            newArray[k] = array[i];
            k++;
        }
    }
    return newArray;
}
    public static void main(String[] args) {


    }
}