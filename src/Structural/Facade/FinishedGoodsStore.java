package Structural.Facade;

public class FinishedGoodsStore implements Store {
	public Goods getGoods() {
		FinishedGoods finishedGoods = new FinishedGoods();
		return finishedGoods;
	}

}
