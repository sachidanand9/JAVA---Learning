import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :"); // reading size of array
        int size = sc.nextInt();

        // creating array object
        int[] a = new int[size];

        // read elements
        a[4]= 20; // Compile Time Success

        // Exception ---> ArrayIndexOutofBoundsException

        for(int index = 0; index<a.length;index++){
            a[index] = sc.nextInt();
        }

        // Print array elemnts

        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index]+",");
        }

    }
}
