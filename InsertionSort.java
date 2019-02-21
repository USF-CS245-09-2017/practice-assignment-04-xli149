/** This is the algorithm for InsertionSort.
 * @author Chris Li
 */
public class InsertionSort implements SortingAlgorithm{
	//Class constructor
	public InsertionSort(){

	}
	/**
	 * Function implemented with Insertion sort algorithm
	 * @param a an array of numbers to be sorted
 	 */
	public void sort(int [] a){
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && temp < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}
}