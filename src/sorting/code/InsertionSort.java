package sorting.code;

public final class InsertionSort {

	/**
	 * Algorithm for sorting small number of elements
	 * 
	 * Continue adding elements, comparing to items already in the array
	 * Array is sorted at any given time
	 * In place
	 */
	
	public static void sortArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int val = arr[i];
			//check value before the current one
			int j = i - 1;
			
			//We protect for indexOutOfBounds, then compare value before to our current one
			while(j > -1 && arr[j] > val){
				//reassign our current value to the one before it
				arr[j + 1] = arr[j];
				//Keep moving values until our current one is the smallest
				//this moves our j back a step so we are still on the same value but also on its updated position
				j = j - 1;
				//Put the value we were comparing in its new place
				arr[j + 1] = val;
			}
		}
	}
}
