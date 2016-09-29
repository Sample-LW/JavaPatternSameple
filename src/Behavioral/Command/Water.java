package Behavioral.Command;

/**
* A waiter is associated with multiple customers and multiple orders
*/

public class Water {
	public Food takeOrder(Customer cust, Order order) {
		Cook cook = new Cook();
		Food food = cook.prepareOrder(order, this);
		return food;
	}
}
