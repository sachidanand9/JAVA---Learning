package int_prep;

public class Fibonacci1 {

	static int fib(int n) {
		if (n<=1)
			return n;
		
		return fib(n-1)+ fib(n-2);
	}
	
	public static void main(String[] args) {
		int a =10;
		
		for(int i = 0;i<a; i++ ) {
			System.out.println(fib(i)+ " ");
		}
	}
}
