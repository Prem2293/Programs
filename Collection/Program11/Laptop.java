package Program11;

public class Laptop implements Comparable<Laptop> {
	int price;
	int ram;
	static int val;
	static int val1;

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", ram=" + ram + "]";
	}

	public Laptop(int price, int ram) {
		this.price = price;
		this.ram = ram;
	}
	
	@Override
	public int compareTo(Laptop o) {
		if (this.price == o.price) {
			return 0;
		} else if (this.price < o.price) {
			return val;
		} else {
			return val1;
		}
	}

}
