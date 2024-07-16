import java.util.Scanner;
public class User_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		add(a,b);
	}
		
	public static void add(int a, int b) {
		
		System.out.println("Sum of a+b is :"+(a+b));
				
	}
	

}
