package Structural.Flyweight;

public class GrindingWheel {
	private int ratioAlumina;
	private int diameter;
	private boolean isGlassBonded;
	
	public GrindingWheel(boolean isGlassBonded) {
		this. isGlassBonded = isGlassBonded;
	}
	// ...

}

/*This class can have other methods getters and setters for diameter, and ratioAlumina, 
 * on which the complete wheel is dependent.
In each of the instances of the wheels, we can pass the values of ratio of alumina to silicon carbide as
 method parameters and also the sizes which can lead to a great number of combinations.

Hence, we can see that by using the flyweight pattern, we can reduce the instances of the class
*/