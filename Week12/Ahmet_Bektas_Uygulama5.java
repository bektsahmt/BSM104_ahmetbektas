import java.util.Scanner;

public class Ahmet_Bektas_Uygulama5 {

	public static void main(String[] args) {
		// girilen kelimeyi girilen sayi kadar bolup her bolumunu bi alt satira yazdiran program
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String girdiStr = girdi.nextLine();
		
		System.out.println("Bir sayi giriniz: ");
		int girdiInt = girdi.nextInt();
		
		ayirici(girdiStr,girdiInt);
		
		}
	
	    public static void ayirici(String str, int n) {
		    int index = 0;
		    for(int i = 0 ; i < str.length()/n ; i++) {
			    System.out.println(str.substring(index, index+n));
			    index = index + n;
		}
	}

}
