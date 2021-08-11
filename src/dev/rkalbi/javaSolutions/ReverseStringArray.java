package dev.rkalbi.javaSolutions;

import java.util.Arrays;

public class ReverseStringArray {

	public static void main(String[] args) {
		String[] i1 =  {"H", "e", "l", "l", "o"};
		String result[]=reverseString(i1);
		System.out.println("Reversed Array: " +Arrays.asList(result));
		
	}
	
	public static String[] reverseString (String[] originalStringArray) {
		
		String temp;
		int j=originalStringArray.length -1;
		for(int i = 0; i<originalStringArray.length/2 ; i++) {
			
			temp = originalStringArray[i];
			originalStringArray[i]=originalStringArray[j];	
			originalStringArray[j] = temp;
			j--;
		}
		return originalStringArray;
		
	}

}
