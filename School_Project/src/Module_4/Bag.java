package Module_4;

public class Bag extends Product {
	String type;

	public String getType() {
		return type;
	}

	public void setTrype(String type) {
		this.type = type;
	}
	@Override
	
public String toString(){
		
		
		String s=(super.toString() +'\n' + "Bag Type : "+this.type +'\n' );
		
		return s;
		
	};


}
