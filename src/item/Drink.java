package item;

public class Drink {

	private String name;
	private int price;
	private int stock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price >= 0 && price <= 10000) {
			this.price = price;
		} else {
			System.out.println("価格が間違っています");
		}
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
