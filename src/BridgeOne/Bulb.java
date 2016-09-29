package BridgeOne;

public class Bulb implements Switch {

	public void switchOn() {
		System.out.println("BULB Switched ON");
		
	}

	public void switchOff() {
		System.out.println("BULB Switched OFF");
	}
	

}

/*
 * Here, we can see, that the interface Switch can be implemented in different ways. 
 * Here, we can easily use Switch as an interface as it has only two functions, on and off.
 *  But, there may arise a case where some other function be added to it, like change() 
 *  (change the switch). In this case, the interface will change and so, the implementations will also changed, for such cases, 
 *  you should use the Switch as abstract class. 
 * This decision should be made earlier to implementation whether the interface should be interface or abstract class. 
 */