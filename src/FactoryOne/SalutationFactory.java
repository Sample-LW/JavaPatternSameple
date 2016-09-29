package FactoryOne;

public class SalutationFactory {
	public static void main(String args[]) {
		SalutationFactory factory = new SalutationFactory();
		factory.getPerson("John Aaron", "M");
//		factory.getPerson(args[0], args[1]);
	}
	public Person getPerson(String name, String gender) {
		if (gender.equals("M"))
			return new Male(name);
		else if(gender.equals("F"))
			return new Female(name);
		else
			return null;
	}
}

/*
When to use a Factory Pattern?
The Factory patterns can be used in following cases:
1. When a class does not know which class of objects it must create.
2. A class specifies its sub-classes to specify which objects to create.
3. In programmer’s language (very raw form), you can use factory pattern where you have to create an object of any one of sub-classes depending on the data provided.
*/