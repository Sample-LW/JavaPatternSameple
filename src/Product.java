import java.util.ArrayList;


public class Product implements Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String productName;
	private String productType;
	String availability;
	
	
	public Product(String productName, String productType, String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability = availability;
	}
	
	public ArrayList<Observer> getObserver() {
		return observers;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductType() {
		return productName;
	}
	public void setProductType(String productName) {
		this.productName = productName;
	}
	
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}
	
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		System.out.println("Notifying to all the subcribers when prod become available");
		for (Observer ob:observers) {
			ob.update(this.availability);
		}
		
	}
	

}
