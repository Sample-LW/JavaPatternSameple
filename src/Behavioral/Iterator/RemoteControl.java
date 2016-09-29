package Behavioral.Iterator;

public class RemoteControl {
	private ChannelSurfer surfer;
	private Settings settings;
	public RemoteControl() {
		surfer = new ChannelSurfer();
		settings = new Settings();
	}	
	
	/**
	* getProgram returns the program for that channel.
	*
	*/
	public Program getProgram(ChannelSurfer surfer) {
		return null;
// 	 	return new Program(surfer.nextChannel());
 	}	 
}

/*
We all know that every channel is associated to a program and it’s basically the program and not the channel number which a user wants to see. And so, the implementation which returns a program for channels surfed.

This tells us that we can apply some logic before returning the elements through iterator. We can set rules. The Iterator here, can also be programmed to return the ‘programs’ straight away rather than returning the channels.

The common Java iterator is Enumeration which has implicit 
hasMoreElements() 
and nextElement() methods.

The benefits of Iterator are about their strength to provide a common interface for iterating through collections without bothering about underlying implementation.
*/