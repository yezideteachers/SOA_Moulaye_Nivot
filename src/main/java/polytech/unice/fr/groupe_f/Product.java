package polytech.unice.fr.groupe_f;

public class Product {

	// Fields
	private static int id=0;
	
	private int quantity;
	private TYPE type;
	private String name;
	private COLOR color;
	private double price;
	private WOOD wood;
	
	// Constructor
	public Product(int quantity, TYPE type, String name,
			COLOR color, double price, WOOD wood) {
		
		id++;
		this.quantity = quantity;
		this.type = type;
		this.name = name;
		this.color = color;
		this.price = price;
		this.wood = wood;
	}
	
	// Getters & Setters
	public int getId(){
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quatity) {
		this.quantity = quatity;
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
	
	public COLOR getColor() {
		return color;
	}
	
	public void setColor(COLOR color) {
		this.color = color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public WOOD getWood() {
		return wood;
	}
	
	public void setWood(WOOD wood) {
		this.wood = wood;
	}
	
	// toString
	@Override
	public String toString() {
		return "Product [id=" + id + ", quantity=" + quantity
				+ ", type=" + type + ", name=" + name + ", color=" + color
				+ ", price=" + price + "wood=" + wood + "]";
	}
}
