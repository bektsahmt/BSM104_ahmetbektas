import java.util.*;
public class StockMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("İlk mağazanın ismi : ");
		String store1 = sc.next();
		Stock stock1 = new Stock(store1);
		int profit1 = makePurchases(stock1, sc);
		
		
		System.out.print("İkinci mağazanın ismi : ");
		String store2 = sc.next();
		Stock stock2 = new Stock(store2);
		int profit2 = makePurchases(stock2, sc);
		
		if(profit1 > profit2) {
			System.out.println(store1 + " daha kazançlıdır.");
		}else if(profit2 > profit1) {
			System.out.println(store2 + " daha kazançlıdır.");
		}else {
			System.out.println(store1 + "ve" +store2+ "eşittir.");
		}
	
	}
	public static int makePurchases(Stock currentStock, Scanner sc) {
		System.out.print("Kaç kez satın alma yaptınız?");
		int numPurchases = sc.nextInt();
		
		for (int i = 1 ; i <= numPurchases; i++) {
			System.out.print(i + " alımda kaç tane aldın? Birim fiyatı nedir? : ");
		int numShares = sc.nextInt();
		int pricePerShare = sc.nextInt();
		currentStock.purchase(numShares, pricePerShare);
			
		}
		
		System.out.print("Güncel birim fiyatı ? ");
		int currentPrice = sc.nextInt();
		
		int profit = currentStock.getProfit(currentPrice);
		System.out.println("Net kazanç/kayıp : " +profit+ "TL");
		System.out.println();
		return profit;
		
		

	}

}
