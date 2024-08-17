import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 0;
        //---> Using Conditional Operator 
        if (n%2==0) 
            count++;

            int n2 = sc.nextInt();
            count = n2%2==0 ? count+1 : count;

            int n3 = sc.nextInt();
            count = n3%2==0 ? count+1: count;

        // ---> Using Switch Statement
        
        switch (count) {
            case 1:{
                System.out.println("case1 :"+ count);
            }
                break;
                case 2:{
                System.out.println("case2 :"+ count);
                }
                break;
                case 3:{
                System.out.println( n*n2*n3);
                }
                break;
        
            default:{
            System.out.println("Invalid");
            }
                break;
        }
        
    }
}