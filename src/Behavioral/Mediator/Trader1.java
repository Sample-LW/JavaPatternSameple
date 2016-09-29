package Behavioral.Mediator;

public class Trader1 {
	public void doTransaction (String typeOfTransaction, int quantity) {
 	 	int expectedPrice = 320;
	Scrip scrip = new Scrip("XYZ");
	int price = StockExchange.getPrice(scrip);
	Trader trader1 = null;
	if(typeOfTransaction.equals("SELL")){
	
	 	 	 	if(price >= expectedPrice){
	StockExchange.doTransaction("SELL", 100, scrip, trader1);
	}
	 	 	}else if(typeOfTransaction.equals("BUY")){
	 	 	 	if(price <= expectedPrice){
	StockExchange.doTransaction("BUY", 100, scrip, trader1);
	}
	 	 	}
	 	}
}
