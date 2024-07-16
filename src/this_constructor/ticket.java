package this_constructor;

public class ticket {
 long  ticketno;
 String movie_name;
 int price;
 ticket(long ticketno, String movie_name, int price){
	this.movie_name = movie_name;
	this.ticketno = ticketno;
	this.price = price;
 }
 public void print() {
	System.out.println(ticketno);
	System.out.println(movie_name);
	System.out.println(price);

}
// public String print() {
//	return "Ticket no :"+ticketno+" Movie Name :"+movie_name+" Price"+price; 
//
//}
 public static void main(String[] args) {
	ticket t1 = new ticket(102037599,"Foji",150);
	t1.print();
	ticket t2 = new ticket(203648386,"war",299);
	t2.print();
	
//	System.out.println(t1.print());
//	System.out.println(t2.print());

	
	
}
}

