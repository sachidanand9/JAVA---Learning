package Array2;

public class frequency_array {
	
	public static void frequencyArray(int[] a) {
		boolean[] r = new boolean[a.length];
		
		for(int i = 0; i<a.length; i++) {
			if(r[i] == false) {
				int count = 1;
				
				for(int j = i+1; j<a.length; j++) {
					if(a[i] == a[j]) {
						count++;
						r[j]=true;
					}
				}
				System.out.println(a[i] + "->" + count);
			}
		}
	}
	
public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5 ,1, 2, 3, 4};
//	int[] b = {10, 20, 30};
	 frequencyArray(a);
	
}
}
