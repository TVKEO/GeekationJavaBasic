package objectExercise;

public class Apartment extends Property {
	private String floor;

	Apartment(String name, String user, String category, int price, String floor) {
		super(name, user, category, price);
		this.floor = floor;
	}

	public void info() {
		super.info();
		System.out.println("間取り：" + this.floor);

	}

	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;

	}
}

//Propertyのサブクラス: マンション