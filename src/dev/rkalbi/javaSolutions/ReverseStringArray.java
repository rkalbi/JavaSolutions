package dev.rkalbi.javaSolutions;

public class ReverseStringArray {

	
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
