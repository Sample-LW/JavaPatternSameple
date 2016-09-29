package Behavioral.Iterator;

/*
 * Behavioral Patterns - Iterator Pattern

The Iterator pattern is one, which allows you to navigate 
through a collection of data using a common interface without knowing about the underlying implementation.

Iterator should be implemented as an interface. This allows the user to 
implement it anyway its easier for him/her to return data.

We use iterators quite frequently in everyday life. For example, remote control of TV. 
Any remote control we use, either at home/hotel or at a friend’s place,
 we just pick up the TV remote control and start pressing Up and Down or
Forward and Back keys to iterate through the channels.

What sort of interface can Iterator be in case of Remote Controls?


 */
public interface Iterator {
	public Channel nextChannel(int currentChannel);
	public Channel prevChannel(int currentChannel);
}
