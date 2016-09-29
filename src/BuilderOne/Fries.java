package BuilderOne;

public class Fries implements Item {
	public Packing pack() {
		return new Envelop();
	}
	
	public int price() {
		return 25;
	}
}
