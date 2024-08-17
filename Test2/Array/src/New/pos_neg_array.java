package New;

public class pos_neg_array {
public static void main(String[] args) {
	int [] a = {-1, 2, -3, 4, 5, 6, -9};
	int negative_count =0, positive_count = 0;
	
	for(int i = 0; i<a.length; i++) {
		if (a[i]<0) {
			negative_count++;
		} else {
positive_count++;
		}
	}
	System.out.println("Total negative number in array are :"+negative_count);
	System.out.println("Total positive number in array are :"+positive_count);
}
}
