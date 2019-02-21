/** This is the algorithm for Bubble Sort.
 * @author Chris Li
 */
public class BubbleSort implements SortingAlgorithm{
	//Class constructor
	public BubbleSort(){

	}
	/**
	 * Function implemented with bubblesort algorithm
	 * @param a an array of numbers to be sorted
 	 */
	public void sort(int [] a){
		for(int i = 0; i < a.length - 1; i++){
			for(int j = 0; j < a.length - i -1; j++){
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
				}
			}
		}
	}
	/**
	 * Function used to swap datas
	 * @param a an array of numbers to be sorted
	 * @param i index of the bigger number
	 * @param j index of the smaller number
 	 */
	public void swap(int [] a, int i, int j){
		int temp = a[i];
		a[i] = a [j];
		a[j] = temp;
	}
}