package New;

public class reverse_array {
public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 6};
	
	int i = 0, j = a.length - 1;
	
	while(i<j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		i++;
		j--;
	}
	
	System.out.print("{");
	for(int k = 0;k<a.length; k++) {
		System.out.print(a[k]+", ");
	}
	System.out.print("}");
}
}
