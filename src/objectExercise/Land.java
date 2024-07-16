package objectExercise;

public class Land extends Property {
	private double widths;

	Land(String name, String user, String category, int price, double widths) {
		super(name, user, category, price);
		this.widths = widths;
	}

	public void info() {
		super.info();
		System.out.println("広さ：" + this.widths + "㎡");

	}

	public double getWidths() {
		return this.widths;
	}

	public void setWidths(double widths) {
		this.widths = widths;

	}
}