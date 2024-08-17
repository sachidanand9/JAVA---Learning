import java.util.Scanner;

public class Symmetric {

    public static int length(int num){
        int count = 0;

        while (num!=0) {
            num = num/10;
            count++;
        }
        return count;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // s2 : find length of num
        int len = length(num);

        if(len%2 == 0){
            // check for symmetric
        }
        else{
            System.out.println("Invalid number");
        }
     }
}
