package Behavioral.Iterator;

public class ChannelSurfer implements Iterator {

	/**
	* nextChannel – method which takes the current channel number
	* and returns the next channel.
	*/
	public Channel nextChannel (int currentChannel) {
 	 	Channel channel = new Channel(currentChannel+1);
		return channel;
 	 }	 	 
 	/**
	* prevChannel – method which takes the current channel number
	* and returns the previous channel.
	*/
	public Channel prevChannel (int currentChannel) {
 	 	Channel channel = new Channel(currentChannel-1);
		return channel;
 	}

}
