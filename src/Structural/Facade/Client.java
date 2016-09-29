package Structural.Facade;

public class Client {
	// To get raw materials
	public static void main(String[] args) {
		StoreKeeper keeper = new StoreKeeper();
		RawMaterialGoods rawMaterialGoods = keeper.getRawMaterialGoods();
		System.out.println("Notifying to all the subscribers when product became available"+ rawMaterialGoods.getGood());  
	}
}
