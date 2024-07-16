package objectExercise;

public class Property {
	private String name;
	private String user;
	private String category;
	private int price;

	Property(String name, String user, String category, int price) {
		this.name = name;
		this.user = user;
		this.category = category;
		this.price = price;
	}

	public void info() {
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.user);
		System.out.println("物件種別：" + this.category);
		System.out.println("物件価格：" + this.price + "円");
	}

	// ゲッター
	public String getName() {
		return this.name;
	}

	public String getUser() {
		return this.user;
	}

	public String getCategory() {
		return this.category;
	}

	public int getPrice() {
		return this.price;
	}

	//セッター
	public void setName(String name) {
		this.name = name;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(int price) {
		this.price = price;

	}
}

//スーパークラス: 物件