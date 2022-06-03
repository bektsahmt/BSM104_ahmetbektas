
public class bubbleSort {

	public static void main(String[] args) {
		int[] array= {10,8,6,4,2,20};
		bubbleSort bb = new bubbleSort();
		bb.bubbleSort(array);
		bb.printArray(array);

	}
	
	public static void bubbleSort(int array[]) {
		for(int j = 0 ; j < array.length-1; j++) {
			for (int index = 0; index < array.length-1 ; index++) {
				if(array[index] > array [index+1]) {
					int temp = array[index];
					array[index]=array[index+1];
					array[index+1] = temp;
				}
				
			}
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			
		}
		System.out.println();
	}
}
