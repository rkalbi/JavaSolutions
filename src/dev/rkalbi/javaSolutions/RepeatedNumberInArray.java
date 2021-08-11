package dev.rkalbi.javaSolutions;

public class RepeatedNumberInArray {

	public static void main(String[] args) {
		int[] i1 =  {1, 3, 4, 2, 2};
		int result=findRepeatedNumber(i1);
		System.out.println("Repeated number: "+result);
		
	}

	static int findRepeatedNumber(int[] iarray) {
		
		//Binary search elements from 1 to n
		int start = 1; 
		int end = iarray.length -1;
		int repeated = -1;		
		
		//Keep searching till range exists
		while (start <= end) {
			
			int middle = (start +end)/2; //applying binary search logic to get divide array
			
			int count = 0; // To keep count of numbers greater than or equal to middle index
			for(int i : iarray) { //Traverse through input array to compare and get count
				if (i<=middle)
				count++;
			}
			
			if (count > middle) { // If count exceeds index then store index as repeated number
				repeated = middle;
				end = middle -1; //Update end of range to exit while loop
			}
			else {
				start = middle +1;//Update end of range to left side of array i.e. middle -1 to continue search
			}
		}	
		return repeated;
	}
}
