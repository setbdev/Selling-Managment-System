public class HealthyBurger extends Hamburger {

	private String addition5Name;
	private double addition5Price;

	private String addition6Name;
	private double addition6Price;

	public HealthyBurger(String meat, double price) {
		super("Brown Rye", meat, price);
	}
	
	public void getBurgerInformation() {
		System.out.println("Healthy Burger");
		System.out.println("Base price = " + super.getBasePrice());
		if (super.getAddition1Name() != null) {
			System.out.println(super.getAddition1Name() + " for an extra " + super.getAddition1Price());
		}
		
		if (super.getAddition2Name() != null) {
			System.out.println(super.getAddition2Name() + " for an extra " + super.getAddition2Price());
		}
		
		if (super.getAddition3Name() != null) {
			System.out.println(super.getAddition3Name() + " for an extra " + super.getAddition3Price());
		}
		
		if (super.getAddition4Name() != null) {
			System.out.println(super.getAddition4Name() + " for an extra " + super.getAddition4Price());
		}
		
		if (this.addition5Name != null) {
			System.out.println(this.addition5Name + " for an extra " + this.addition5Price);
		}
		
		if (this.addition6Name != null) {
			System.out.println(this.addition6Name + " for an extra " + this.addition6Price);
		}
		
		System.out.println("Total price = " + super.getPrice());
	}
	
	public double addAddition5(String additionName, double additionPrice) {
		this.addition5Name = additionName;
		this.addition5Price = additionPrice;
		setPrice(getPrice() + additionPrice);
		System.out.println(additionName + " added for an extra " + additionPrice);
		return this.addition5Price;
	}
	
	public double addAddition6(String additionName, double additionPrice) {
		this.addition6Name = additionName;
		this.addition6Price = additionPrice;
		setPrice(getPrice() + additionPrice);
		System.out.println(additionName + " added for an extra " + additionPrice);
		return this.addition6Price;
	}

}