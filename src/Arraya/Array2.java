package Arraya;

 

public class Array2 {
public static void main(String[] args) {
	String[] arr= {"AJX","RJX","DJX","KVY","TDX"};
	
	char[]ch = {'b','c','a','f','e','d'};
	
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
	System.out.println("Reverse order :");
	
	for(int i=arr.length-1; i>=0 ;--i){
		
		System.out.println(arr[i]);
	}
	
	
	System.out.println(" Char output : ");
	
	for (int i = 0; i<ch.length; i++) {
		// -----> for vowel matching in the array and throw output <------
		if (ch[i]=='a' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {  
		System.out.println(ch[i]);
		}
			
	}
	

}
}


