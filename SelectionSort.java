/** This is the algorithm for Selection sort.
 * @author Chris Li
 */
public class SelectionSort implements SortingAlgorithm{
	//Class constructor
	public SelectionSort(){

	}
	/**
	 * Function implemented with selection sort algorithm
	 * @param a an array of numbers to be sorted
 	 */
	public void sort(int [] a){
		for(int i = 0; i < a.length - 1; i++){
			int smallest = i;
			for(int j = i + 1; j < a.length; j++){
				if(a[j] < a[smallest]){
					smallest = j;	
				}
			}
			swap(a, i, smallest);
			
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
		a[i] = a[j];
		a[j] = temp;
	}
}