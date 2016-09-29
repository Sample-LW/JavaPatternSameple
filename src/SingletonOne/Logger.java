package SingletonOne;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

//import org.apache.commons.logging.*;

public class Logger {
	private String fileName;
	private Properties properties;
//	private Priority priority;
	
	/**
	* Private constructor
	*/
	private Logger() {
	logger = this;
	}

	/**
	* Level of logging, error or information etc
	*
	* @return level, int
	*/
	public int getRegisteredLevel() {
	int i = 0;
	try {
	InputStream inputstream = getClass().getResourceAsStream("Logger.properties");
	properties.load(inputstream);
	inputstream.close();
	i = Integer.parseInt(properties.getProperty("**logger.registeredlevel**"));
	if(i < 0 || i > 3)
	i = 0;
	}
	catch(Exception exception) {
	System.out.println("Logger: Failed in the getRegisteredLevel method");
	exception.printStackTrace();
	}
	return i;
	}
	/**
	* One file will be made daily. So, putting date time in file
	* name.
	*
	* @param gc GregorianCalendar
	* @return String, name of file
	*/
	private String getFileName(GregorianCalendar gc) {
	SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy");
	String dateString = dateFormat1.format(gc.getTime());
	String fileName = "Log_" + dateString + ".txt";
	return fileName;
	}

	/**
	* A mechanism to log message to the file.
	*
	* @param p Priority
	* @param message String
	*/
	/*
	public void logMsg(Priority p, String message) {
		try {
		GregorianCalendar gc = new GregorianCalendar();
		String fileName = getFileName(gc);
		FileOutputStream fos = new FileOutputStream(fileName, true);
		PrintStream ps = new PrintStream(fos);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm:ss a");
		ps.println("<"+dateFormat2.format(gc.getTime())+">["+message+"]");
		ps.close();
		}
		catch (IOException ie) {
		ie.printStackTrace();
		}
	}
	*/
	/**
	* this method initialises the logger, creates an object
	*/
	public static void initialize() {
	logger = new Logger();
	}

	// singleton - pattern
	private static Logger logger;
	public static Logger getLogger() {
	return logger;
	}
}
/*
 * Difference between static class and static method approaches:
One question which a lot of people have been asking me. What’s the difference between a singleton class and a static class? The answer is static class is one approach to make a class “Singleton”.

We can create a class and declare it as “final” with all the methods “static”. In this case, you can’t create any instance of class and can call the static methods directly.

Example:

final class Logger {
//a static class implementation of Singleton pattern
static public void logMessage(String s) {
System.out.println(s);
}
}// End of class

//==============================
public class StaticLogger {
public static void main(String args[]) {
Logger.logMessage("This is SINGLETON");
}
}// End of class

The advantage of this static approach is that it’s easier to use. The disadvantage of course is that if in future you do not want the class to be static anymore, you will have to do a lot of recoding.
*/
