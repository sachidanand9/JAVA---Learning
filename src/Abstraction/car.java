package Abstraction;

abstract class car {
	public void wheels() {
		System.out.println(4);
	}
	public abstract void color ();
	public abstract void cc ();

}
class tata extends car{
	public void color() {
		System.out.println("Black");
	}
	
	public void cc() {
		System.out.println(100);
	}
}
