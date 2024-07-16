package int_prep;

public class Fibonacci {
 static void Fibonacci(int N) {
	 int a = 0, b = 1;
	 
	 for (int i = 0; i < N;i++) {
		 System.out.println(a+" ");
		 
		 //swap
		 int c = b+a;
		 a=b;
		 b=c;

	 }
 }
 
 public static void main(String[] args) {
	int N = 3;
	
	Fibonacci(N);
}
}
