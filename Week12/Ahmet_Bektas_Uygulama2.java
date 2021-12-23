import java.util.* ;
public class Ahmet_Bektas_Uygulama2 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Kac ogrencinin notu girilecek?: ");
		int OgrenciSayisi = girdi.nextInt();
		double ortalama[] = new double[OgrenciSayisi];
		
		System.out.println(OgrenciSayisi + " tane ogrencinin notu girilecektir.");
		
		for(int ogrencisirasi = 1; ogrencisirasi <= OgrenciSayisi ; ogrencisirasi++  ) {
			System.out.println( ogrencisirasi + ". ogrencinin vize notunu giriniz: ");
			int vizeNotu = girdi.nextInt();
			
			System.out.println( ogrencisirasi + ". ogrencinin final notunu girdiniz: ");
			int finalNotu = girdi.nextInt();
            
			ortalama[ogrencisirasi-1] = ortalama(vizeNotu,finalNotu);
		}
		
		System.out.println("Tum Ogrencilerin Gecme Puanı");
		System.out.println(Arrays.toString(ortalama));
	}
   
	      public static double ortalama(int vizeNotu, int finalNotu) {
	    	  vizeNotu = (int) vizeNotuHesaplama(vizeNotu);
	    	  finalNotu = (int) finalNotuHesaplama(finalNotu);
	    	  double ortalama = vizeNotu*0.4 + finalNotu*0.6;
	    	  return ortalama;
	      }
	
	      public static double vizeNotuHesaplama(int vizeNotu) {
	    	  double not = 0.0;
	    	  if(vizeNotu >= 80) {
	    		  not = vizeNotu*1.10;
	    		  
	    	  }
	    	  else if(vizeNotu >= 60) {
	    		  not = vizeNotu*1.05;
	    	  }
	    	  if(not > 100)
	    		  not = 100;
	    	  return not;
	    		  
	      }
	      
	      public static double finalNotuHesaplama(int finalNotu) {
	    	  double not = 0.0;
	    	  if(finalNotu >=70) {
	    		  not = finalNotu * 1.10;
	    		  
	    	  }
	    	  else if (finalNotu >= 40) {
	    		  not = finalNotu * 1.05;
	    		  
	    	  }
	    	  if(not>100)
	    		  not = 100;
	    	  return not;
	      }
}
