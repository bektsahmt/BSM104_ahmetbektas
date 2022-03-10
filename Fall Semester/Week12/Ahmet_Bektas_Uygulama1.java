
public class Ahmet_Bektas_Uygulama1 {

	public static void main(String[] args) {
		// metotlari main icerisinde veya kendi icerisinde cagirmazsak duzgun calismaz.
         	
		ilkMetot();
		int GelenDeger = ikinciMetot(5);
		System.out.println(GelenDeger);
	}
	
    public static void ilkMetot() {
    	System.out.println("Ilk Metot...");
    }
    
    public static int ikinciMetot(int sayi) {
    	int DonecekDeger = sayi*sayi;
    	return DonecekDeger;
    }
    
}
