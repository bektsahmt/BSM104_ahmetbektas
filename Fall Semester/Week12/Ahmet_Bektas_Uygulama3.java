import java.util.Scanner;
public class Ahmet_Bektas_Uygulama3 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Eleman sayisi giriniz: ");
		int elemanSayisi = girdi.nextInt();
		
		int dizi[] = new int[elemanSayisi];
		for(int index = 0 ; index < dizi.length ; index++) {
			System.out.println("Dizinin " + index + " indexli elemanini giriniz:");
			dizi[index] = girdi.nextInt();
		}
		double ortalama = ortalama(dizi);
			System.out.println(ortalama);

	}
    public static double ortalama(int[] dizi ) {
    	double average = 0.0;
        int toplam = 0;
        for(int index = 0 ; index < dizi.length ; index++) {
        	toplam += dizi[index];
        	
        }
    	average = (double) toplam / dizi.length;
    	return average;
    
    }
    
}
