package Program10;


public class Menu implements Comparable<Menu> {
	String name;
	int price;

	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [item=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Menu o) {
		if (this.price == o.price) {
			return 0;
		} else if (this.price > o.price) {
			return -1;
		} else {
			return 1;
		}
//		return this.price-o.price;

	}

}
