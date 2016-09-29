package Behavioral.Command;

public class Cook {

 	public Food prepareOrder(Order order, Water waiter) {
		Food food = getCookedFood(order);
		return food;
	}
	public Food getCookedFood(Order order) {
		Food food = new Food(order);
		return food;
	}
}
