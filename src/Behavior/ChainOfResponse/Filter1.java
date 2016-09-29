package Behavior.ChainOfResponse;

/**
* This is a filter. This filters out the gravel and
* passes the rest to the next level.
*/

public class Filter1 extends Sill {
	private int size;

	public Filter1(int size) {
		this.size = size;
	}

	/**
	* over-ridden method from base class
	*/
	public void collect(Matter gravel) {
	 	// for the entire quantity of matter
		for(int i = 0; i < gravel.getQuantity(); i++) {
 	 	// if gravel size is less than size of filter, 
		// the gravel will pass to the next level.
		if(gravel.getSize() < size) {
			super.collect(gravel);
		} else {
			//collect here. that means, only matter with less 
			// size will pass...
			}
		}	 	 
	 }	

}

/*
This is how, this pattern works. Based on principles of decoupling, 
the pattern is totally data-driven. The famous example is the Exception hierarchy.

The other advantage is distribution of responsibilities. 
There can be such a scenario when none of the objects in the chain can handle the request. 
In this case, the chain will discard the request. The basic object can also be an interface depending on needs. 
*/