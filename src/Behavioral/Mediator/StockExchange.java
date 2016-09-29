package Behavioral.Mediator;

/*
 * Behavioral Patterns - Mediator Pattern

The mediator pattern deals with the complexity which comes in the coding when 
number of classes increase. I will explain this. When we begin with development, 
we have a few classes and these classes interact with each other producing results.
 Now, consider slowly, the logic becomes more complex and functionality increases.
  Then what happens? We add more classes and they still interact with each other but it gets really 
  difficult to maintain this code now. Mediator pattern takes care of this problem. 
  It makes the code more maintainable. It promotes loose-coupling of classes such that only one class
   (Mediator) has the knowledge of all the classes, rest of the classes have their responsibilities and 
   they only interact with the Mediator.

A very common example can be airplanes interacting with the control tower and not among themselves. 
The control tower knows exactly, where each of the airplanes is, and guides them whereas 
the airplanes have their own responsibilities of landing and takeoff. Another popular example
 is Stock exchange. In old days when there were no stock markets, the individual brokers used to buy or sell
  commodities among themselves. They used to face huge risks, of defaulting of counterparty, limited information 
  (as, only limited deals in limited areas were possible), limited geographical reach, price variance (everyone 
  could quote whatever price they wanted) and many more.

So, the concept of stock exchange came into play. For ex: BSE or NSE in India and NYSE, 
NASDAQ etc in the US. The stock exchange started acting like a mediator and the traders did not need to know
 other traders and services provided by them to make a deal. The traders have their own responsibilities as buyers
  and sellers and it was stock exchange’s responsibility to match their deals and get the settlement done. 
  Many of the above mentioned risks were mitigated by this. But, there were some standardization procedures 
  which came into picture because of this. All the traders who wanted to deal on stock exchange had to follow
   these standardization procedures.

Let’s look at the code part
 */
public class StockExchange {
	public static void doTransaction (String typeOfTransaction, int quantity, Scrip scrip, Trader trader) {
 	 	Transaction transaction = new Transaction(typeOfTransaction, quantity, scrip, trader);
		// try and match the current transaction
		// with the ones saved in DB and find out
		// whether a counter transaction is there or
		// are there many such transactions which could
		// fulfill requirement of this transaction.
		matchTransaction(transaction);
	}
	private static void matchTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}
	public static int getPrice (Scrip scrip) {
	 	 	// try and match this transaction with all
	// the saved ones. If they match till whatever extent
	// trade for that. Then save, with status Traded for
	// number of shares traded and save the rest as New.
		return 0;
 	}	 
}
