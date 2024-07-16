package Variables;
          // ------------ Static block ---------
public class book {
	String author;
	int page;
	int price;
	private void printdeatils(){
		System.out.println(author);
		System.out.println(price);
		System.out.println(page);

	}
	public static void main(String[] args) {
		book b1 = new book();
		b1.author = "skot";
		b1.page = 2000;
		b1.price = 99;
		
		b1.printdeatils();
	}

}
