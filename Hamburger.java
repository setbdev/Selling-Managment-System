public class Hamburger {

	private String breadRoll;
	private String meat;
	private double price;
	private double basePrice;

	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;
	
	
	

	public Hamburger(String breadRoll, String meat, double price) {
		this.breadRoll = breadRoll;
		this.meat = meat;
		this.price = price;
		this.basePrice = price;
	}
	
	public void getBurgerInformation() {
		System.out.println("Healthy Burger");
		System.out.println("Base price = " + this.basePrice);
		if (this.addition1Name != null) {
			System.out.println(this.addition1Name + " for an extra " + this.addition1Price);
		}
		
		if (this.addition2Name != null) {
			System.out.println(this.addition2Name + " for an extra " + this.addition2Price);
		}
		
		if (this.addition3Name != null) {
			System.out.println(this.addition3Name + " for an extra " + this.addition3Price);
		}
		
		if (this.addition4Name != null) {
			System.out.println(this.addition4Name + " for an extra " + this.addition4Price);
		}
		
		System.out.println("Total price = " + this.price);
	}
	
	

	public double addAddition1(String additionName, double additionPrice) {
		this.addition1Name = additionName;
		this.addition1Price = additionPrice;
		this.price += additionPrice;
		System.out.println(additionName + " added for an extra " + additionPrice);
		return this.addition1Price;
	}

	public double addAddition2(String additionName, double additionPrice) {
		this.addition2Name = additionName;
		this.addition2Price = additionPrice;
		this.price += additionPrice;
		System.out.println(additionName + " added for an extra " + additionPrice);
		return this.addition2Price;
	}

	public double addAddition3(String additionName, double additionPrice) {
		this.addition3Name = additionName;
		this.addition3Price = additionPrice;
		this.price += additionPrice;
		System.out.println(additionName + " added for an extra " + additionPrice);
		return this.addition3Price;
	}

	public double addAddition4(String additionName, double additionPrice) {
		this.addition4Name = additionName;
		this.addition4Price = additionPrice;
		this.price += additionPrice;
		System.out.println(additionName + " added for an extra " + additionPrice);
		return this.addition4Price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String getBreadRoll() {
		return this.breadRoll;
	}

	public String getMeat() {
		return this.meat;
	}

	public double getPrice() {
		return this.price;
	}
	
	public String getAddition1Name() {
		return this.addition1Name;
	}
	public double getAddition1Price() {
		return this.addition1Price;
	}
	
	public String getAddition2Name() {
		return this.addition2Name;
	}
	public double getAddition2Price() {
		return this.addition2Price;
	}
	
	public String getAddition3Name() {
		return this.addition3Name;
	}
	public double getAddition3Price() {
		return this.addition3Price;
	}
	
	public String getAddition4Name() {
		return this.addition4Name;
	}
	public double getAddition4Price() {
		return this.addition4Price;
	}
	
	public double getBasePrice() {
		return this.basePrice;
	}
	
	
	
	
	
}