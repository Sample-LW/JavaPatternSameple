package Behavioral.Interpreter;

public class NotesProducer {
	private Frequency freq;

	public NotesProducer() {
		this.freq = freq;
	}

	/**
	* This method produces the sound wave of the
	* frequency it gets.
	*/
	public void playSound(Frequency freq) {
	}
}

/*
This is how an interpreter pattern works in its most simple implementation.
 If you are using interpreter pattern, you need checks for grammatical mistakes etc. 
 This can make it very complex. Also, care should be taken to make the interpreter as flexible as possible,
  so that the implementation can be changed at later stages without having tight coupling.

Other advantage of Interpreter is that you can have more than one interpreter 
for the same output and create the object of interpreter based on the input. E.g. 
“Sa” or “Do” can also be implemented as “Download” activity in some other language.
 In this case, you can use same input and different outputs by getting the proper interpreter 
 from the InterpreterFactory.

This is not a very common pattern.
*/