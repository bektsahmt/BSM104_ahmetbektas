import java.util.Scanner;

public class Ahmet_Bektas_Uygulama4 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String kelime = girdi.nextLine();
		
		System.out.println("Girilen kelime = " + kelime);
		
		System.out.println("Kelimenin tersten yazilmis hali: " + tersten(kelime));
	}
	
	public static String tersten(String kelime) {
		
		String ters = " ";
		for(int index = kelime.length(); index > 0; index --) {
			ters += kelime.substring(index-1,index);
			// abc a-0 b-1 c-2 substring(0,1) (1-2) (2-3) [hepsini yazdırmak istersek (0-3) yazdırıcaz]
			
		}
		
		return ters;
	}

}
