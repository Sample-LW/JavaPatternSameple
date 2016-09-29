package Structural.Proxy;

/*
 * Structural Patterns - Proxy Pattern

The proxy pattern is used when you need to represent a complex with a simpler one. If creation of object is expensive, 
its creation can be postponed till the very need arises and till then, a simple object can represent it. 
This simple object is called the “Proxy” for the complex object

The cases can be innumerable why we can use the proxy. Let’s take a scenario. Say, we want to attach an image with the email. 
Now, suppose this email has to be sent to 1 lakh consumers in a campaign. Attaching the image and sending along with the email 
will be a very heavy operation. What we can do instead is, send the image as a link to one of the sevlet.
 The place holder of the image will be sent. Once the email reaches the consumer, 
 the image place holder will call the servlet and load the image at run time straight from the server.

Let’s try and understand this pattern with the help of a non-software example as we have tried to do throughout this article.

Let’ say we need to withdraw money to make some purchase. The way we will do it is, go to an ATM and get the money,
 or purchase straight with a cheque. In old days when ATMs and cheques were not available, what used to be the way??? 
 Well, get your passbook, go to bank, get withdrawal form there, stand in a queue and withdraw money. 
 Then go to the shop where you want to make the purchase. In this way, we can say that ATM or 
 cheque in modern times act as proxies to the Bank. 

Let’s look at the code now.

Bank will define the entire method described above. There are references of classes like You (as the person who wants 
to withdraw money), also Account, as persons account. These are dummy classes and can be considered of fulfilling the
 responsibilities as described.
 */
public class Bank {
	private int numberInQueue;
	
	/**
	* Method getMoneyForPurchase
	* This method is responsible for the entire banking
	* operation described in the write-up
	*/
	public double getMoneyForPurchase(double amountNeeded) {
		
		// get object for person
		You you = new You("Prashant");
		
		// get obj for account
		Account account = new Account();
		// get person's acount Number
		String accountNumber = you.getAccountNumber();
		// passbook got
		boolean gotPassbook = you.getPassbook();
		
		// get number in queue
		int number = getNumberInQueue();
		
		// the number will decrease every few mins
		while (number != 0) {
			number--;
		}
		
		// now when the number = 0, check if balance is sufficient
		boolean isBalanceSufficient = account.checkBalance(accountNumber, amountNeeded);
		
		if(isBalanceSufficient)
			return amountNeeded;
		else
			return 0;
	}
	
	/**
	* returns the number in the queue
	*/
	private int getNumberInQueue() {
		return numberInQueue;
	}
}
