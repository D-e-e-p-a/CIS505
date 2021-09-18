package Module_4;

public class Ball extends Product{
	private String color = " ";
	
	Ball(){
		super();
		color="";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public String toString(){
		
		
		String s=(super.toString() +'\n' + "Color : "+this.color );
		
		return s;
		
	};

}
