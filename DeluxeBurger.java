public class DeluxeBurger extends Hamburger {
	
	public DeluxeBurger(String breadRoll, String meat, double price) {
		super(breadRoll, meat, price);
		super.addAddition1("Coke 2L", 2.50);
		super.addAddition2("Chips XXL", 3.40);
	}
	
	
	
	public void getBurgerInformation() {
		System.out.println("Deluxe Burger");
		System.out.println("Base price = " + super.getBasePrice());
		if (super.getAddition1Name() != null) {
			System.out.println(super.getAddition1Name() + "for an extra " + super.getAddition1Price());
		}
		
		if (super.getAddition2Name() != null) {
			System.out.println(super.getAddition2Name() + "for an extra " + super.getAddition2Price());
		}
		
		System.out.println("Total price = " + super.getPrice());
	}
	
	
	
	
	public double addAddition1(String additionName, double additionPrice) {
		System.out.println("Deluxe burger with chips and drink. No extra addition allowed.");
		return -1;
	}

	public double addAddition2(String additionName, double additionPrice) {
		System.out.println("Deluxe burger with chips and drink. No extra addition allowed.");
		return -1;
	}

	public double addAddition3(String additionName, double additionPrice) {
		System.out.println("Deluxe burger with chips and drink. No extra addition allowed.");
		return -1;
	}

	public double addAddition4(String additionName, double additionPrice) {
		System.out.println("Deluxe burger with chips and drink. No extra addition allowed.");
		return -1;
	}
	
	public double addAddition5(String additionName, double additionPrice) {
		System.out.println("Deluxe burger with chips and drink. No extra addition allowed.");
		return -1;
	}
	
	public double addAddition6(String additionName, double additionPrice) {
		System.out.println("Deluxe burger with chips and drink. No extra addition allowed.");
		return -1;
	}
	
}