package BuilderOne;

public abstract class Burger implements Item{
 	/**
	* A burger is packed in a wrapper. Its wrapped
	* in the paper and is served. The class Wrapper is 
	* sub-class of Packing interface.
	* @return new Wrapper for every burger served.
	*/
	public Packing pack() {
	return new Wrapper();
	}
	/**
	* This method remains abstract and cannot be
	* given an implementation as the real implementation
	* will lie with the type of burger.
	*
	* E.g.:- Veg Burger will have a different price from
	* a fish burger.
	*
	* @return price, int.
	*/
	public abstract int price();
}
