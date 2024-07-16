package Array2;

public class remove_elemnt {
public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5, 1, 2, 3, 4};
	int[] c = removeDuplicate(a);
	
	for(int i = 0; i<c.length; i++) {
		System.out.println(c[i]);
	}
}
public static int[] removeDuplicate(int[] a) {
	boolean[] r = new boolean[a.length];
	int count = 0;
	
	for(int i = 0 ; i<a.length; i++) {
		if(r[i] == false) {
			count++;
			
			for(int j = i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					r[j] =true;
				}
			}
		}
	}
	int[] c = new int[count];
	
	for(int i = 0, j= 0; i<r.length; i++) {
		if(r[i]==false) {
			c[j] = a[i];
			j++;
		}
	}
	return c;
}

}
