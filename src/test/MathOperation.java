package test;

public class MathOperation {
	
public int add(int a, int b) {
	return a+b;
}
public double add(double a, double b) {
	double d;
	return d = a+b;
}
public static void main(String[] args) {
	MathOperation m = new MathOperation();
	System.out.println(m.add(15, 15));
	System.out.println(m.add(45.98,34.76));
}
}
