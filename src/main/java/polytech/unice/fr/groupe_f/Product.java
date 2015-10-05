package polytech.unice.fr.groupe_f;

public class Product {

	static int id=0;
	int quatity,size;
	TYPE type;
	String name,color;
	double price;
	public Product(int quatity, int size, TYPE type, String name,
			String color, double price) {
		
		id++;
		this.quatity = quatity;
		this.size = size;
		this.type = type;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", quatity=" + quatity + ", size=" + size
				+ ", type=" + type + ", name=" + name + ", color=" + color
				+ ", price=" + price + "]";
	}
}
