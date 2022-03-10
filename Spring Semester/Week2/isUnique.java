
public class isUnique {

	public static void main(String[] args) {
		int[] array1 = {1,43,7,9,-5,1,13,3};
		int[] array2 = {1,2,3,4,5,5,7,8};
		 
		if(isUnique(array2))
			System.out.println("Ayni sayi yok");
		else
			System.out.println("Ayni sayi var");

	}
    public static boolean isUnique(int[] arraysolve) {
    	for (int sayi1 = 0; sayi1 < arraysolve.length; sayi1++) {
    		for (int sayi2 = sayi1+1 ; sayi2 < arraysolve.length; sayi2++) {
				if(arraysolve[sayi1]== arraysolve[sayi2])
					return false;
			}
			
		}
    	return true;
    }
    }
