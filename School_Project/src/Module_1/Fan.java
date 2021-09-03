
package Module_1;

public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed ;
	private boolean on ;
	private double radius;
	private String color ;

	Fan() {
		speed = Fan.SLOW;
		on = false;
		radius = 5;
		color = "Blue";
	}

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

	public String toString() {

		String message = null;

		if (isOn()) {
			message = "Fan Speed :" + "Fan is Off!" + '\n' + "Fan Color: " + getColor() + '\n' + "Fan Radius:"
					+ getRadius();
		} else {
			message ="Fan Speed :" + getSpeed() + '\n' + "Fan Color: " + getColor() + '\n' + "Fan Radius:"
					+ getRadius();
		}
		return message;
	}

}
