package Module_4;

public class ProductDB {

	public static <E> GenericQueue<Product> getProduct(String code) {
		GenericQueue<Product> product = null;

		if (code.equalsIgnoreCase("b")) {
			

			GenericQueue<Product> balls = new GenericQueue<>(); // Product generic queue named Balls

			// Creating ball objects from ball 1 to 5

			Ball ball1 = new Ball();

			ball1.setCode("B100");
			ball1.setColor("Blue");
			ball1.setDescription("Brunswick Rhino Bowling Ball");
			ball1.setPrice(84.95);

			Ball ball2 = new Ball();

			ball2.setCode("B200");
			ball2.setColor("Blue");
			ball2.setDescription("Black Widow 2,0");
			ball2.setPrice(84.95);

			Ball ball3 = new Ball();

			ball3.setCode("B300");
			ball3.setColor("Blue");
			ball3.setDescription("Axiom Pearl");
			ball3.setPrice(84.95);

			Ball ball4 = new Ball();

			ball4.setCode("B400");
			ball4.setColor("Blue");
			ball4.setDescription("Proton Physicx");
			ball4.setPrice(84.95);

			Ball ball5 = new Ball();

			ball5.setCode("B500");
			ball5.setColor("Blue");
			ball5.setDescription("Force Unleashed");
			ball5.setPrice(84.95);

			// Adding the objects to the list

			balls.enque(ball1);
			balls.enque(ball2);
			balls.enque(ball3);
			balls.enque(ball4);
			balls.enque(ball5);

			return balls;

		} else if (code.equalsIgnoreCase("s")) {

			GenericQueue<Product> ShoeList = new GenericQueue<>(); // Product generic queue named Shoe

			// Creating shoe objects from 1 to 5

			Shoe shoe1 = new Shoe();

			shoe1.setCode("S100");
			shoe1.setDescription("Men's Black 2.0");
			shoe1.setSize(3.0);
			shoe1.setPrice(39.99);

			Shoe shoe2 = new Shoe();

			shoe2.setCode("S200");
			shoe2.setDescription("Womens White 2.0");
			shoe2.setSize(8.0);
			shoe2.setPrice(39.99);

			Shoe shoe3 = new Shoe();

			shoe3.setCode("S300");
			shoe3.setDescription("Youth Lightining 3.0");
			shoe3.setSize(6.0);
			shoe3.setPrice(50.99);

			Shoe shoe4 = new Shoe();

			shoe4.setCode("S400");
			shoe4.setDescription("Kids Boys 4.0");
			shoe4.setSize(3.0);
			shoe4.setPrice(39.99);

			Shoe shoe5 = new Shoe();

			shoe5.setCode("5100");
			shoe5.setDescription("Kids Girls 5.0");
			shoe5.setSize(3.0);
			shoe5.setPrice(39.99);

			// Adding the objects to the list
			ShoeList.enque(shoe1);
			ShoeList.enque(shoe2);
			ShoeList.enque(shoe3);
			ShoeList.enque(shoe4);
			ShoeList.enque(shoe5);

			return ShoeList;

		} else if (code.equalsIgnoreCase("a")) {

			GenericQueue<Product> bagList = new GenericQueue<>(); // Product generic queue named Shoe

			Bag bag1 = new Bag();

			bag1.setCode("A100");
			bag1.setDescription("Silver Royal Blue");
			bag1.setTrype("Triple");
			bag1.setPrice(60.00);

			Bag bag2 = new Bag();

			bag2.setCode("A200");
			bag2.setDescription("Dazzling blazers");
			bag2.setTrype("Double");
			bag2.setPrice(50.50);

			Bag bag3 = new Bag();

			bag3.setCode("A300");
			bag3.setDescription("Little Big Sharks");
			bag3.setTrype("Single");
			bag3.setPrice(40.00);

			// Adding the objects to the list
			bagList.enque(bag1);
			bagList.enque(bag2);
			bagList.enque(bag3);

			return bagList;
		} else {

			return product; //for all other product code returning null.

		}

	}
}
