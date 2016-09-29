package Structural.Flyweight;

/*
 * Structural Patterns - Flyweight Pattern

The pattern here states about a mechanism by which you can avoid creating a large number of object instances to represent the entire system.

To decide if some part of your program is a candidate for using Flyweights, consider whether it is possible to remove some data from the class and 
make it extrinsic. 
If this makes it possible to reduce greatly the number of different class instances your program needs to maintain, this might be a case where 
Flyweights will help.

The typical example you can see on this in every book will be of folders. The folder with name of each of the company employee on it, so, the 
attributes of class Folder are: ‘Selected’ , ‘Not Selected’ and the third one is ‘employeeName’. With this methodology, we will have to create 2000 
folder class instances for each of the employees. This can be costly, so we can create just two class instances with attributes ‘selected’ and ‘not selected’ 
and set the employee’s name by a method like:

setNameOnFolder(String name);

This way, the instances of class folder will be shared and you will not have to create multiple instances for each employee.

I was going through this pattern and was trying to find the best suited non-software example. Then, I remembered the talks I had with one of my
 cousin’s who used to work in a grinding wheel manufacturing company. I am a Chemical Engineer and so, remember the names of chemical compounds. 
 He was telling me that the grinding wheels are used for metal cutting across the industry. Basically the main ingredients for these grinding wheels are 
 Aluminum Oxide (Al2O3) and Silicon Carbide (SiC). These compounds are used in form of grains. For those who remember Chemistry from schools, and for others, 
 just follow the example. 

His company manufactures nearly 25000 types of grinding wheels. Now, there is another technicality in this and that is bonding.

There are two types of bondings used to bond the material i.e. Aluminum Oxide and Silicon Carbide together. One is Glass bonding – this is like, 
the wheel is heated to 1300 degree C and the silicon turns into glass to hold the two materials together. The second type of bonding is Resin bonding, 
this is when some resins help in holding the materials together. The wheels are in different sizes, have different ratio of materials mixed and have any
 of these two types of bondings. This decides the strength of the wheel. In all, creating 25,000 types of combinations is a pretty complex looking scenario. 

If we consider this from software point of view, we can see that each wheel is of a different type and so, we need to make 25000 classes for taking care 
of each of the wheel. This of course will be very resource intensive. So, how to avoid this?

Well, we already know a few things and we can see a common pattern in each of the wheels. The common things are as follows:

1. Materials of use – They are always Aluminum Oxide and Silicon Carbide.
2. Each wheel has a bonding.
3. Each wheel has a size.

We can follow one thing, the combination above mentioned three ingredients can give us a large number of instances so, why not take a scenario where 
only one of these is used in the constructor and rest be passed as method parameters.

Let’s have a look at the code. For every flyweight, there is a factory providing the object instance. Now, naturally wheels are made in a factory so,
 there is GrindingWheelFactory class which returns the type of wheel needed.
 */
public class GrindingWheelFactory {
	public GrindingWheel getWheel(boolean isGlassBonded) {
		// The method takes the input params n return the appropriate wheel
		return new GrindingWheel(isGlassBonded);
	}
}
