package cheong_a.submit09;

public class Product {

	private String name;
	private int price;
	
	public Product() {}
	
	public Product(String name, int price) {
		
		this.name = name;
		this.price = price;

	}

	@Override
	public String toString() {
		return "[제품명: " + name + ", 가격: " + price + "]";
	}

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
		this.price = price;
	}

}
