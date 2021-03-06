package Structural.Decorator;
/*
 * Structural Patterns - Decorator Pattern

The decorator pattern helps to add behavior or responsibilities to an object. This is also called “Wrapper”.
 Suppose we have some 6 objects and 2 of them need a special behavior, we can do this with the help of a decorator.

Java Design Patterns suggest that Decorators should be abstract classes and the concrete implementation should be derived from them.

The decorator pattern can be use wherever there is a need to add some functionality to the object or group of objects. Let’s take an example of a Christmas tree. 
There is a need to decorate a Christmas tree. 
Now we have many branches which need to be decorated in different ways.
 */

public abstract class Decorator {
	public abstract void place(Branch branch);
}
