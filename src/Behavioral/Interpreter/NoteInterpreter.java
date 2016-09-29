package Behavioral.Interpreter;

/*
 * Behavioral Patterns - Interpreter Pattern

The Interpreter Pattern defines a grammatical representation for a 
language and an interpreter to interpret the grammar. The best example you can get for this 
is Java itself which is an interpreted language. It converts the code written in English to 
a byte code format so as to make possible for all the operating systems to understand it. 
This quality of it makes it platform independent. 

The development of languages can be done when you find different cases but, somewhat similar, 
it is advantageous to use a simple language which can be interpreted by the system and can deal with all 
these cases at the same time.

To make this interpreter clearer, let’s take an example. The “musical notes” is an “Interpreted Language”.
 The musicians read the notes, interpret them according to “Sa, Re, Ga, Ma…” or “Do, Re, Me… ” etc and play 
 the instruments, what we get in output is musical sound waves. Think of a program which can take the Sa, Re, 
 Ga, Ma etc and produce the sounds for the frequencies.

For Sa, the frequency is 256 Hz, similarly, for Re, it is 288Hz and for Ga, it is 320 Hz etc etc…

In this, case, we need these values set somewhere so, that when the system encounters any one of these 
messages, we can just send the related frequency to the instrument playing the frequency.

We can have it at one of the two places, one is a constants file, “token=value” and the other one being in a
 properties file. The properties file can give us more flexibility to change it later if required.

This is how a properties file will look like:

MusicalNotes.properties

# Musical Notes Properties file
# This denotes the frequencies of musical notes in Hz
Sa=256
Re=288
Ga=320

Here are the other classes used for this system
 */
public class NoteInterpreter {
	private Note note;
	private Frequency freq;

	/**
	* This method gets the note from the keys pressed.
	* Them, this sets it at a global level.
	*/
	public void getNoteFromKeys(Note note) {
		Frequency freq = getFrequency(note);
		sendNote(freq);
	}

	/**
	* This method gets the frequency for the note.
	* Say, if the note is “Sa”, it will return 256.
	*/
	private Frequency getFrequency(Note note) {
		// Get the frequency from properties
		// file using ResourceBundle
		// and return it.
		return freq;
	}

	/**
	* This method forwards the frequency to the
	* sound producer which is some electronic instrument which
	* plays the sound.
	*/
	private void sendNote(Frequency freq) {
		NotesProducer producer = new NotesProducer();
		producer.playSound(freq);
	}
}
