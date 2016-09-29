package Behavioral.Command;

public class Food {

	public Food(Order order) {
		// TODO Auto-generated constructor stub
	}


}

/*Now, here, the waiter takes command and wraps it in an order,
 *  the order is associated to a particular customer. For, the cook, the order is associated to a
 *   cook and also Food is associated to the Order.

The order is an object which depends on the command.
 The food item will change as soon as the command changes. 
 This is loose-coupling between the client and the implementation.

*/