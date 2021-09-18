package Module_4;


public class ProductApp {

	public static void main(String[] args) {
		Ball ball=new Ball();
		ball.setCode("ABC");
		ball.setColor("Blue");
		ball.setDescription("FootBall");
		ball.setPrice(1);
		
		
		System.out.println(ball.toString());
	}

}
