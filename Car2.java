/**
 * The Car class is a blueprint for the creation of Car objects.  
 * This class defines the attributes of a car object as private instance variables.
 * This class manipulates the instance variable attributes through the use of constructor methods, accessor methods, and mutator methods along with a toString method to display attributes and data manipulation.
 *
 * Created 26NOV2017
 * email: email
 * @author sapper
 * @version 1.0
 */

public class Car2 {
	//instance variables, aka class attributes
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	//static instance variable to make count independent of objects created.
	private static int count = 0;

	/**
	 * The Car() constructor is the default constructor method used to instantiate a Car object with default attributes.
	 * This constructor makes default assignments to the instance variables of the class.
	 * default attributes are:
	 * color = "no color assigned"
	 * horsePower = 0
	 * engineSize = 0
	 * make = "no make assigned."
		panel.add();
	 * No parameters are passed through this constructor.
	 */
	public Car2() {
		this.color = "no color assigned.";
		this.horsePower = 0;
		this.engineSize = 0;
		this.make = "no make assigned.";
		count++;
	}

	/**
	 * This method is an overloaded constructor method used to instantiate an object of the Car class and modify the class instance variable attributes by passing parameters through the constructor.
	 * @param color, a string which sets the color of the car object to the to the value of the instance variable.
	 * @param horsePower, an integer which sets the value of the horsePower attribute.
	 * @param engineSize, a double which sets the default attribute to the value of the parameter.
	 * @param make, a string parameter which is assigned to the make instance variable.
	 */
	public Car2(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
		count++;
	}

	/**
	 * This method is a getter or accessor method which returns the value assigned to the color instance variable.
	 * @return returns the current string value of the color attribute
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * This method is a getter or accessor method which returns the value assigned to the horsePower instance variable.
	 * @return returns the current integer value of the horsePower attribute.
	 */
	public int getHorsePower() {
		return this.horsePower;
	}

	/**
	 * This method is a getter or accessor method which returns the value assigned to the engineSize instance variable.
	 * @return returns the current double value of the engineSize attribute.
	 */
	public double getEngineSize() {
		return this.engineSize;
	}

	/**
	 * This method is a getter or setter method which returns the value assigned to the make instance variable.
	 * @return returns the current string value of the make attribute
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * This method is a setter or mutator method which assigns the string parameter passed as the new value of the color attribute.
	 * @param color, a string value assigned to the color instance variable.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * This method is a setter or mutator method which assigns the integer parameter passed as the new value of the horsePower attribute.
	 * @param horsePower, a integer value assigned to the horsePower instance variable.
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	/**
	 * This method is a setter or mutator method which assigns the double parameter passed as the new value of the engineSize attribute.
	 * @param engineSize, a double value assigned to the engineSize instance variable.
	 */
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	/**
	 * This method is a setter or mutator method which assigns the string parameter passed as the new value of the make attribute.
	 * @param make, a string value assigned to the make instance variable.
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * This method is a setter method for the count instance variable which will keep track of how many car objects are created.
	 * @param count, an integer value which will be assigned to the count attribute.
	 */
	//public void setCount(int count) {
	//	this.count = count;
	//}

	/**
	 * This method is a getter method which will return the number of car objects created.
	 * @return returns the current integer value assigned to the static instance variable count.
	 */
	public static int getCount() {
		return count;
	}

	public boolean doesEqual(Car2 test) {
		return ((this.color.equals(test.color)) && (this.horsePower == test.horsePower) && (this.engineSize == test.engineSize) && (this.make.equals(test.make)));
	}

	/**
	 * This method is a getter or accessor method which returns the current values of the class object attributes.
	 * @return returns a string concatenated with the current value of the attributes.
	 */
	public String toString() {
		return "\n[make: " + this.make + "\ncolor: " + this.color + "\nengine size: " + this.engineSize + "\nhorse power: " + this.horsePower + "]";
	} 
}
