package observer2;

public class ObserverPatternMain {
    public static void main(String[] args) {  
        Person arpitPerson=new Person("Arpit");  
        Person johnPerson=new Person("John");  
          
        Product samsungMobile=new Product("Samsung", "Mobile", "Not available");  
          
        //When you opt for option "Notify me when product is available".Below registerObserver method  
        //get executed      
        samsungMobile.registerObserver(arpitPerson);  
        samsungMobile.registerObserver(johnPerson);  
          
        //Now product is available  
        samsungMobile.setAvailability("Available");  
           
    }  

}

/*
Some important points about observer pattern:

Loose coupling between Subject and Observer:Only thing subject know about its observers is that observer implements Observer interface.
You can register or delete any observer without affecting subject.
Support for broadcast communication:Notification about subject state change does not need to specify its receiver.
This notification is broadcasted to all interested object that subscribed to it.
The one of the problem with this pattern is that debugging become very hard,
if you have large number of subscribers because flow of control is implicit between subject and observers.
Spurious updates:If criteria for state change is not well defined then sometimes it lead to spurious updates.

Read more at http://www.java2blog.com/2013/02/observer-design-pattern-in-java.html#xdB4etGoHJ5Bi7vF.99
*/