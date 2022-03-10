
public class sumTo {

	public static void main(String[] args) {
		System.out.println(sumTo(5));
		

	}
    public static double sumTo(double sayi) {
    	if(sayi <0)
    	throw new IllegalArgumentException("Sayiniz 0'dan buyuk degil!");
    	if(sayi == 0)
    		return 0.0;
    	return(double) sumTo(sayi-1)+ 1.0/sayi;
    }
}
