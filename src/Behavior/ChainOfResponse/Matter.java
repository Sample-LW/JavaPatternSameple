package Behavior.ChainOfResponse;

/*
 * Behavioral Patterns - Chain of Responsibility Pattern

The chain of responsibility pattern is based on the same principle as written above. 
It decouples the sender of the request to the receiver. 
The only link between sender and the receiver is the request which is sent. 
Based on the request data sent, the receiver is picked. 
This is called “data-driven”. In most of the behavioral patterns, 
the data-driven concepts are used to have a loose coupling.

The responsibility of handling the request data is given to any of the members of the “chain”. 
If the first link of the chain cannot handle the responsibility, it passes the request data to 
the next level in the chain, i.e. to the next link. For readers, familiar with concepts of Java, 
this is similar to what happens in an Exception Hierarchy. Suppose the code written throws an 
ArrayIndexOutOfBoundsException. Now, this exception is because of some bug in coding and so, 
it gets caught at the correct level. Suppose, we have an application specific exception in the catch block. 
This will not be caught by that. It will find for an Exception class and will be caught by that as both
 the application specific exceptions and the ArrayIndexOutOfBoundsException are sub-classes of the class
  Exception.

Once get caught by the exception, which is the base class, it will then not look for any other exception.
 This is precisely the reason why, we get an “Exception is unreachable” message when we try to add a catch 
 block with the exception below the parent exception catch block.

So, in short, the request rises in hierarchy till some object takes responsibility to handle this request. 

It’s the same mechanism used for multi-level filtration. Suppose, we have a multi level filter and gravel 
of different sizes and shapes. We need to filter this gravel of different sizes to approx size categories. 
We will put the gravel on the multi-level filtration unit, with the filter of maximum size at the top and 
then the sizes descending. The gravel with the maximum sizes will stay on the first one and rest will pass, 
again this cycle will repeat until, the finest of the gravel is filtered and is collected in the sill below
 the filters. Each of the filters will have the sizes of gravel which cannot pass through it. And hence, 
 we will have approx similar sizes of gravels grouped.

Let’s apply the same example in the form of code.

First, let’s talk about the request data. In this case, it is the gravel. We call it Matter. It has size
 and quantity. Now, the size determines whether it matches the size of filter or not and the quantity 
 tells how much matter is below the size.
 */
public class Matter {
	// size of matter
	private int size;
	// quantity
	private int quantity;

	/**
	* returns the size
	*/
	public int getSize() {
		return size; 
	}
	/**
	* sets the size
	*/
	public void setSize(int size) {
		this.size = size; 
	}

	/**
	* returns the quantity
	*/
	public int getQuantity() {
		return quantity; 
	}

	/**
	* sets the quantity
	*/
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}
}
