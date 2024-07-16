package Variables;
             // ------ NON STATIC BLOCK ------------
public class Demo {
	{
		System.out.println("Non static bock");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
	}

}
