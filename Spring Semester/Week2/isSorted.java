
public class isSorted {	

	public static void main(String[] args) {
		double[] array1 = {16.1,12.3,22.2,14.4};
		double[] array2 = {1.5,4.3,7.0,19.5,25.1,46.2};
		if(isSorted(array2))
			System.out.println("Sayilar siralidir");
		else
			System.out.println("Sayilar sirali degildir!");
	}
    public static boolean isSorted(double[] a) {
    	
    	if(a.length<=1)
    		return true;
    	for (int sayi = 0; sayi < a.length-1 ; sayi++) {
    		if(a[sayi] > a[sayi+1])
    			return false;
			
		}
    	return true;	
				
			}
			
		
    }
    

