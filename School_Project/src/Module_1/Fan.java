
package Module_1;

public class Fan {
	//constant variable declaration
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	//instance variables
	private int speed ;
	private boolean on ;
	private double radius;
	private String color ;

	
	Fan() {					//constructor with default values
		speed = Fan.SLOW;
		on = false;
		radius = 5;
		color = "Blue";
	}

	
	//getter and setter methods for the instance variables
	public int getSpeed() { 
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//method to print the final results 

	public String toString() {

		String message = null;

		if (isOn()) {
			message = "The fan is " + getColor() + " with a radius of "+ getRadius() + " and the fan is off";
					
		} else {
			message ="The fan speed is set to speed " + getSpeed()+ " with a color of "+ getColor() + " and a radius of " + getRadius();
		}
		return message;
	}
}
