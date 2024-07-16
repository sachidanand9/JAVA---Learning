package Array2;

public class uniqe_element_array {

	public static int uniqe_element(int[] a) {
		boolean[] r = new boolean[a.length];
		int count =0;
		
		for(int i = 0; i<a.length; i++) {
			
			if (r[i]==false) {
				count++;
				
				for(int j = i+1; j<a.length; j++) {
					
					if(a[i] == a[j]) {
						r[j] = true;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 4, 3, 2, 1, 5 };
		
		System.out.println(uniqe_element(a));
	}
}
