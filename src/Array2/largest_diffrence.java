package Array2;

public class largest_diffrence {

	public static int largestDiff(int[] a) {
		int big,small;
		big=small = a[0];
		for(int i = 1; i<a.length;i++ ) {
			if(big<a[i]){
				big = a[i];
			}
			if(small>a[i]) {
				small = a[i];
			}
		}
		return big - small;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 10};
		System.out.println(largestDiff(a));
	}
}
