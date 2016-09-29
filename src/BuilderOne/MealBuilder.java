package BuilderOne;

public class MealBuilder {
	public Packing additems() {
		Item[] items = {new VegBurger(), new Fries(), new Cola(),  new Doll()};
		return new MealBox().addItems(items);
	}

	public int calculatePrice() {
		int totalPrice = new VegBurger().price() + new Cola().price() + new Fries().price() + new Doll().price();
	
		return totalPrice;
	}
}

/*
This class gives the total meal and also presents the total price. Here, we have abstracted the price calculation and meal package building activity from the presentation, which is a meal box. The Builder pattern hides the internal details of how the product is built.

Each builder is independent of others. This improves modularity and makes the building of other builders easy.

Because, each builder builds the final product step by step, we have more control on the final product. 
*/