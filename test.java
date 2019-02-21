public class test{
	public static void main(String arg[]){
		int a[] = {3,6,4,8,3,6,8};
		SelectionSort b = new SelectionSort();
		b.sort(a);
		for(int i = 0; i < a.length; i++){
		System.out.println(a[i]);
 		}
 	}
}