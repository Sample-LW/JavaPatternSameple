package AbstractFactory1;

//Creational Patterns - Abstract Factory Pattern
//
//This pattern is one level of abstraction higher than factory pattern. 
//This means that the abstract factory returns the factory of classes. 
//Like Factory pattern returned one of the several sub-classes, this returns such factory which later will return one of the sub-classes.
		
public class ComputerType {
	private Computer comp;
	
	public static void main(String[] args) {
		ComputerType type = new ComputerType();
		
		Computer computer = type.getComputer("Server");
		System.out.println("Monitor:" + computer.getMonitor().getSpecification());
		System.out.println("RAM:" + computer.getRAM().getSpecification());
		System.out.println("Processor:" + computer.getProcessor().getSpecification());
	}

	public Computer getComputer(String computerType) {
		
		if(computerType.equals("PC"))
			comp = new PC();
		else if(computerType.equals("Workstation"))
			comp = new Workstation();
		else if(computerType.equals("Server"))
			comp = new Server();
		
		return comp;
	}
}

//When to use Abstract Factory Pattern?
//One of the main advantages of Abstract Factory Pattern is that it isolates the concrete classes that are generated. 
//The names of actual implementing classes are not needed to be known at the client side. 
//Because of the isolation, you can change the implementation from one factory to another.