package Array2;

import java.util.Iterator;

public class inster_array {
	
	public static int[] insertArray(int[] a, int[] b, int in) {
		int[] c = new int[a.length + b.length];
		if (in<0 || in>a.length) {
			System.out.println("index out of range");
		} else {
          for(int i = 0; i<a.length; i++) {
        	  if (i<in) {
				c[i] = a[i];
			} else {
              c[i+ b.length] = a[i];
			}
          }
          for(int i = 0; i<b.length; i++) {
        	  c[in +i] = b[i];
          }
		}
          return c;
	}
	
 public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5};
	int[] b = {10, 20, 30};
	int[] c = insertArray(a, b, 2);
	
	for(int i = 0; i<c.length; i++) {
		System.out.println(c[i]);
	}
}
}
