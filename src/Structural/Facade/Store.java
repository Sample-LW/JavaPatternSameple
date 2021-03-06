package Structural.Facade;

/*
 * Structural Patterns - Facade Pattern

Facade as the name suggests means the face of the building. 
The people walking past the road can only see this glass face of the building. 
They do not know anything about it, the wiring, the pipes and other complexities. 
The face hides all the complexities of the building and displays a friendly face.

This is how facade pattern is used. It hides the complexities of the system and provides an interface to the client
 from where the client can access the system. In Java, the interface JDBC can be called a facade. We as users or clients create connection using
  the “java.sql.Connection” interface, the implementation of which we are not concerned about. The implementation is left to the vendor of driver.

Let’s try and understand the facade pattern better using a simple example. Let’s consider a store. 
This store has a store keeper. In the storage, there are a lot of things stored e.g. packing material, raw material and finished goods.

You, as client want access to different goods. You do not know where the different materials are stored. You just have access to store 
keeper who knows his store well. Whatever you want, you tell the store keeper and he takes it out of store and hands it over to you on showing him
 the credentials. Here, the store keeper acts as the facade, as he hides the complexities of the system Store. 

Let us see how the Store example works.
 */
public interface Store {
	public Goods getGoods();
}
