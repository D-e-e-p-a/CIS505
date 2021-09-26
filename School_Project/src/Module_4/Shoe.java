package Module_4;

public class Shoe extends Product {
	private double size = 0.0;

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override

	public String toString() {

		String s = (super.toString() + '\n' + "Shoe Size : " + this.size+'\n' );

		return s;

	};
	

}
