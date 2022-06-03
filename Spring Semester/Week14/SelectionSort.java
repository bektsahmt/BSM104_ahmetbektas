
public class SelectionSort {

	public static void main(String[] args) {
		int[] array= {15,12,14,20,30,5};
		
		SelectionSort ob = new SelectionSort();
		ob.sort(array);
		System.out.println("Sorted array: ");
		ob.paintArray(array);

	}
	
	public static void sort(int array[]) {
		for (int index = 0; index < array.length; index++) {
			int min_index=index;
			for (int j = index+1 ; j < array.length; j++) {
				min_index=j;
				
			}
			int temp = array[min_index];
			array[min_index]=array[index];
			array[index] = temp;
			
		}
	}
	public static void paintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
