package New;

public class Count_array {
public static void main(String[] args) {
	int [] a = {2,3,4,5,6,7,8,9,1};
	int ec = 0, oc=0;
	for(int i = 0; i<a.length; i++) {
		if (a[i]%2==0) {
			ec++;
		} else {
oc++;
		}
			}
	System.out.println("total even number present in array are :"+ec);
	System.out.println("total odd number present in array are :"+oc);
}
}
