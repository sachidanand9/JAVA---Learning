package Arraya;
import java.util.Arrays;
public class Emp {
      public static void main(String[] args) {
    	  
    	  int[] n = { 5, 2, 1, 5, 6};
    	  String[] str = {"c", "a", "b", "A"};
    	  Arrays.sort(n);
    	  Arrays.sort(str);
    	  
    	  for(int i = 0; i<n.length; i++)
    		  System.out.println(n[i]);
//    	  System.out.println(str[i]);
      }
}
