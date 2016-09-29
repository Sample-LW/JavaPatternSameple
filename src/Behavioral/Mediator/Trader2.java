package Behavioral.Mediator;

public class Trader2 {
	public void doTransaction (String typeOfTransaction, int quantity) {
 	 	int expectedPrice = 320;
Scrip scrip = new Scrip("XYZ");
int price = StockExchange.getPrice(scrip);
Trader trader2 = null;
if(typeOfTransaction.equals("SELL")){

 	 	 	if(price >= expectedPrice){
StockExchange.doTransaction("SELL", 100, scrip, trader2);
}
 	 	}else if(typeOfTransaction.equals("BUY")){
 	 	 	if(price <= expectedPrice){
StockExchange.doTransaction("BUY", 100, scrip, trader2);
}
 	 	}
 	}
}

/*
This is simple illustration of how we can use a mediator. Here are the main features of a mediator:
• Responsibilities to individual objects.
• Mediator is the only smart delegating object.
• Transparency for other objects.
• If more objects join in, only place of registration is Mediator, other objects do not need to know anything about the new object.
• The code becomes very maintainable.

On hind side, this brings standardization, which might be cumbersome. Also, there might be a slight loss in efficiency.
*/