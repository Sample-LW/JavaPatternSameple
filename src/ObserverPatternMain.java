
public class ObserverPatternMain {

	public static void main(String[] args) {
		Person arpitPerson = new Person("Arpit");
		Person johnPerson = new Person("John");
		
		Product samsungMobile = new Product("Samsung", "Mobile", "Not available");
		
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);
		
		samsungMobile.setAvailability("Available");
	}
}
            