package Behavioral.Command;

/*
 * Behavioral Patterns - Command Pattern

This is another of the data-driven pattern. The client invokes a particular module using a command. 
The client passes a request, this request gets propagated as a command. The command request maps to particular 
modules. According to the command, a module is invoked. 

This pattern is different from the Chain of Responsibility in a way that, in the earlier one, 
the request passes through each of the classes before finding an object that can take the responsibility.
 The command pattern however finds the particular object according to the command and invokes only that one.

It’s like there is a server having a lot of services to be given, and on Demand (or on command),
 it caters to that service for that particular client.

A classic example of this is a restaurant. A customer goes to restaurant and orders the food according
 to his/her choice. The waiter/ waitress takes the order (command, in this case) and hands it to the cook in
  the kitchen. The cook can make several types of food and so, he/she prepares the ordered item and hands it
   over to the waiter/waitress who in turn serves to the customer.

Let’s have a look at this example with Java code.

First thing is the Order. The order is made of command which the customer gives the waiter.
 */
public class Order {
	private String command;
	
	public Order(String command) {
		this.command = command;
	}
}
