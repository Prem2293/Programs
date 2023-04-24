package Program9;

public class Pizza implements Comparable<Pizza> {
	int size;
	int price;
	public Pizza(int size, int price) {
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Pizza o) {
		if (this.price==o.price) {
			return 0;
		}else if (this.price>o.price) {
			return -1;
		}else {
			return 1;
		}
//		return this.price-o.price;
		
	}
	

}
