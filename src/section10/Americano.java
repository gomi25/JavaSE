package section10;

public class Americano extends Espresso {
	
	public int water;
	
	public Americano(String bean, String brand, int water) {
		super(bean);
		super.brand = brand; // this.brand = brand; 도 가능
		this.water = water;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("water: " + water);
	}
}
