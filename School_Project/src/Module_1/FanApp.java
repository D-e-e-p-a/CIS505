package Module_1;

public class FanApp {

	public static void main(String[] args) {
		
		Fan fan1=new Fan();  //Fan object one
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.setOn(true);
		
		Fan fan2=new Fan();  //Fan object two
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("Blue");
		fan2.setOn(false);
		
	
		System.out.println("Fan 1" + '\n' +fan1.toString());
		System.out.println();
		System.out.println("Fan 2" +'\n'+ fan2.toString());
		

	}

}
